package com.xiaoshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能说明： 基于SpringCloud的文件服务器  （基于nacos配置中心/注册中心）
 * 用户分布式内网环境下，存储图片使用（可以用于图片服务器）  tracer（负载均衡节点）
 *
 * @ com.ubtechinc.config
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2021/01/07@15:24
 * <p>
 * Copyright (C)2012-@2019 小树盛凯科技 All rights reserved.
 */
@SpringBootApplication
public class XiaoshuDfsTracerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoshuDfsTracerApplication.class, args);
    }

}
