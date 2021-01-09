package com.xiaoshu.controller;

import com.xiaoshu.service.feign.FileFeignImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 功能说明： 文件上传服务；
 *
 * @ com.xiaoshu.controller
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2021/1/7@17:49
 * <p>
 * Copyright (C)2012-@2021 深圳优必选科技 All rights reserved.
 */
@Api(value = "文件上传管理")
@RestController
@RequestMapping(value = "/dfs")
@Slf4j
public class FileUploadController {

    @Autowired(required = false)
    private FileFeignImpl fileFeign;

    @ApiOperation("文件处理接口")
    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public String queryFile(){
        log.info("文件处理接口");
        fileFeign.fileUpload();
        return "success";
    }

    /**
     * @param file
     * @return
     */
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ApiOperation(value = "上传文件")
    public String uploadFile(@ApiParam(value = "file") @RequestParam(value = "file") MultipartFile file) {
        log.info("Consumer upload the file , file name is :{}", file.getName());
        return fileFeign.uploadFileService(file);
    }
}
