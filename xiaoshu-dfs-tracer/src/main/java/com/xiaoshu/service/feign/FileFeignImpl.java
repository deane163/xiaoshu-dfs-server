package com.xiaoshu.service.feign;

import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 功能说明：
 *
 * @ com.xiaoshu.service.feign
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2021/1/7@19:46
 * <p>
 * Copyright (C)2012-@2021 深圳优必选科技 All rights reserved.
 */
@FeignClient(value = "xiaoshu-dfs-storage")
public interface FileFeignImpl {

    /**
     * 文件上传操作
     * @return
     */
    @ApiOperation("storage-文件上传接口")
    @RequestMapping(value = "/feign/file", method = RequestMethod.GET)
    String fileUpload();

}
