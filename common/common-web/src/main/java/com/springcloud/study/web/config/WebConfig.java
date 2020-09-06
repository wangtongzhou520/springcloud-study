package com.springcloud.study.web.config;

import com.springcloud.study.web.handler.AuditLogInterceptorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web config 基础配置
 *
 * @author wangtongzhou
 * @since 2020-09-06 09:21
 */
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private AuditLogInterceptorHandler auditLogInterceptorHandler;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(auditLogInterceptorHandler);
    }
}
