package com.xiaoshu.controller;

import com.xiaoshu.model.ResultCode;
import com.xiaoshu.model.ResultVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 功能说明： 提供文件上传接口服务； （storage提供存储功能）
 *
 * @ com.xiaoshu.controller
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2021/1/7@17:48
 * <p>
 * Copyright (C)2012-@2021 小树盛凯科技 All rights reserved.
 */

@RestController
@RequestMapping(value = "/feign")
@Slf4j
public class FileController {

    /**
     * 进行文件查询操作
     * @param name
     * @return
     */
    @ApiOperation("storage-文件处理接口")
    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public String fileUpload(String name){
        log.info("[storage] 文件处理接口 name:{}", name);
        return  name;
}

    /**
     * 上传文件服务，负责文件上传操作
     *
     * @param file
     * @return
     */
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ApiOperation(value = "文件上传")
    public String uploadFileService(@ApiParam(value = "file") @RequestPart("file") MultipartFile file){
        log.info("[storage] start upload the file , file name is :{}", file.getOriginalFilename());
        String fileName = file.getOriginalFilename();
        String fileType = fileName.substring(fileName.indexOf("."));
        File newFile = new File("D:/temp/" + System.currentTimeMillis() + fileType);
        try {
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回
        return fileName;
    }
}
