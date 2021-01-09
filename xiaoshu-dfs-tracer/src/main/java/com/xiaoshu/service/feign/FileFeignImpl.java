package com.xiaoshu.service.feign;

import com.xiaoshu.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 功能说明：
 *
 * @ com.xiaoshu.service.feign
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2021/1/7@19:46
 * <p>
 * Copyright (C)2012-@2021 深圳优必选科技 All rights reserved.
 */
@FeignClient(value = "xiaoshu-dfs-storage", configuration = FeignConfig.class)
public interface FileFeignImpl {

    /**
     * 文件测试操作
     * @return
     */
    @RequestMapping(value = "/dfs-storage/feign/file", method = RequestMethod.GET)
    String fileUpload();

    /**
     * function: provide file upload , by Feign ;
     *
     * @param file
     * @return
     */
    @PostMapping(value = "/dfs-storage/feign/upload",  consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFileService(@RequestPart("file") MultipartFile file);

}
