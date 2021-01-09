package com.xiaoshu.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能说明： 文件上传的Feign配置信息；
 *
 * @ com.xiaoshu.config
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2020/10/28@10:56
 * <p>
 * Copyright (C)2012-@2020 深圳小树盛凯科技 All rights reserved.
 */
@Configuration
public class FeignConfig {

    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }

}
