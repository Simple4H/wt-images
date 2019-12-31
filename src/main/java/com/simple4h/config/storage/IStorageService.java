package com.simple4h.config.storage;

import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author Create By Simple4H
 * @date 2019-12-30 11:59
 */
public interface IStorageService {

    /**
     * 存储一个文件对象
     *
     * @param inputStream   文件输入流
     * @param contentLength 文件长度
     * @param contentType   文件类型
     * @param keyName       文件名
     */
    void store(InputStream inputStream, long contentLength, String contentType, String keyName);

    String mallPrivateStore(InputStream inputStream, long contentLength, String contentType, String keyName);

    Stream<Path> loadAll();

    Path load(String keyName);

    Resource loadAsResource(String keyName);

    void delete(String keyName);

    String generateUrl(String keyName);

    String getDownloadUrl(String keyName);
}
