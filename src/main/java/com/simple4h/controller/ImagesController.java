package com.simple4h.controller;

import com.simple4h.service.IImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author Create By Simple4H
 * @date 2019-12-30 12:21
 */
@RestController
@RequestMapping("/images/")
public class ImagesController {

    @Autowired
    private IImagesService iImagesService;

    @PostMapping("create")
    public Object create(@RequestParam("file") MultipartFile file) throws IOException {
        return iImagesService.uploadImage(file.getInputStream(), file.getSize(), file.getContentType(), file.getOriginalFilename());
    }
}
