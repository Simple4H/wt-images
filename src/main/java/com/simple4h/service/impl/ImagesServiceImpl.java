package com.simple4h.service.impl;

import com.simple4h.dao.WtStorageMapper;
import com.simple4h.domain.WtStorage;
import com.simple4h.service.IImagesService;
import com.simple4h.config.storage.IStorageService;
import com.simple4h.utils.CharUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * @author Create By Simple4H
 * @date 2019-12-30 12:16
 */
@Service("iImagesService")
public class ImagesServiceImpl implements IImagesService {

    @Autowired
    private IStorageService iStorageService;

    @Autowired
    private WtStorageMapper wtStorageMapper;

    @Override
    public String uploadImage(InputStream inputStream, long contentLength, String contentType, String fileName) {
        String key = generateKey(fileName);

        WtStorage wtStorage = new WtStorage();
        wtStorage.setKey(key);
        wtStorage.setName(fileName);
        wtStorage.setType(contentType);
        wtStorage.setSize((int) contentLength);
        wtStorage.setUrl(iStorageService.generateUrl(key));
        wtStorage.setAddTime(LocalDateTime.now());
        wtStorage.setDeleted(false);
        wtStorageMapper.insertSelective(wtStorage);

        iStorageService.store(inputStream, contentLength, contentType, key);
        return wtStorage.getUrl();
    }

    private String generateKey(String fileName) {
        int index = fileName.lastIndexOf('.');
        String suffix = fileName.substring(index);
        return CharUtil.getRandomString(8) + "_" + suffix;
    }
}
