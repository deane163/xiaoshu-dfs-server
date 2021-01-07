package com.xiaoshu.controller;

import com.xiaoshu.service.feign.FileFeignImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    private FileFeignImpl fileFeignImpl;

    @ApiOperation("文件上传接口")
    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public String fileUpload(){
        log.info("上传文件接口");
        fileFeignImpl.fileUpload();
        return "success";
    }
}
