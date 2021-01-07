package com.xiaoshu.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明：
 *
 * @ com.xiaoshu.controller
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2021/1/7@17:48
 * <p>
 * Copyright (C)2012-@2021 深圳优必选科技 All rights reserved.
 */

@RestController
@RequestMapping(value = "/feign")
@Slf4j
public class FileController {

    @ApiOperation("storage-文件上传接口")
    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public String fileUpload(){
        log.info("[storage] 上传文件接口");
        return "success";
    }
}
