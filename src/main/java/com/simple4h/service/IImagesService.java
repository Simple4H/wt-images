package com.simple4h.service;

import java.io.InputStream;

/**
 * @author Create By Simple4H
 * @date 2019-12-30 12:15
 */
public interface IImagesService {

    /**
     * 上传图片
     * @param inputStream 输入流
     * @param contentLength 长度
     * @param contentType 类型
     * @param fileName 名称
     */
    String uploadImage(InputStream inputStream, long contentLength, String contentType, String fileName);
}
