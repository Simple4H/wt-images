package com.simple4h.config.storage.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Create By Simple4H
 * @date 2019-12-30 12:00
 */
@Data
@Component
public class QiniuStorageProperties {

    private  String endpoint;

    private  String accessKey;

    private  String secretKey;

    private  String bucketName;

    private  long expireInSeconds;
}
