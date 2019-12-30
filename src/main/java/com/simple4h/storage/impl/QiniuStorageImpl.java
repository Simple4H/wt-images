package com.simple4h.storage.impl;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.simple4h.storage.IStorageService;
import com.simple4h.storage.config.QiniuStorageProperties;
import com.simple4h.utils.SpringContextUtil;
import lombok.Data;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author Create By Simple4H
 * @date 2019-12-30 11:56
 */
@Data
public class QiniuStorageImpl implements IStorageService {

    private String endpoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;
    private Auth auth;
    private UploadManager uploadManager;
    private BucketManager bucketManager;

    /**
     * 七牛云OSS对象存储简单上传实现
     */
    @Override
    public void store(InputStream inputStream, long contentLength, String contentType, String keyName) {
        if (uploadManager == null) {
            if (auth == null) {
                auth = Auth.create(accessKey, secretKey);
            }
            uploadManager = new UploadManager(new Configuration());
        }

        try {
            String upToken = auth.uploadToken(bucketName);
            Response response = uploadManager.put(inputStream, keyName, upToken, null, contentType);
        } catch (QiniuException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String mallPrivateStore(InputStream inputStream, long contentLength, String contentType, String keyName) {
        QiniuStorageProperties qiniuStorageProperties = SpringContextUtil.getBean("qiniuStorageProperties");
        String accessKey = qiniuStorageProperties.getAccessKey();
        String secretKey = qiniuStorageProperties.getSecretKey();
        String bucketName = qiniuStorageProperties.getBucketName();
        String publicUrl = "https://" + qiniuStorageProperties.getEndpoint() + "/" + keyName;
        String finalUrl = null;
        long expireInSeconds = qiniuStorageProperties.getExpireInSeconds();

        if (uploadManager == null) {
            if (auth == null) {
                auth = Auth.create(accessKey, secretKey);
            }
            uploadManager = new UploadManager(new Configuration());
        }

        try {
            String upToken = auth.uploadToken(bucketName);
            Response response = uploadManager.put(inputStream, keyName, upToken, null, contentType);
            finalUrl = auth.privateDownloadUrl(publicUrl, expireInSeconds);
        } catch (QiniuException ex) {
            ex.printStackTrace();
        }
        return finalUrl;
    }

    @Override
    public Stream<Path> loadAll() {
        return null;
    }

    @Override
    public Path load(String keyName) {
        return null;
    }

    @Override
    public Resource loadAsResource(String keyName) {
        try {
            URL url = new URL(generateUrl(keyName));
            Resource resource = new UrlResource(url);
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                return null;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delete(String keyName) {
        if (bucketManager == null) {
            if (auth == null) {
                auth = Auth.create(accessKey, secretKey);
            }
            bucketManager = new BucketManager(auth, new Configuration());
        }

        try {
            bucketManager.delete(bucketName, keyName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String generateUrl(String keyName) {
        return endpoint + "/" + keyName;
    }

    @Override
    public String getDownloadUrl(String keyName) {
        QiniuStorageProperties qiniuStorageProperties = SpringContextUtil.getBean("qiniuStorageProperties");
        String accessKey = qiniuStorageProperties.getAccessKey();
        String secretKey = qiniuStorageProperties.getSecretKey();
        if (auth == null) {
            auth = Auth.create(accessKey, secretKey);
        }
        String publicUrl = "https://" + qiniuStorageProperties.getEndpoint() + "/" + keyName;
        return auth.privateDownloadUrl(publicUrl, 60 * 60);
    }
}
