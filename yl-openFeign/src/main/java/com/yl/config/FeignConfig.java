package com.yl.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yangshuaibo
 * @Configuration 全局配置作用于所有的服务提供方
 */
@Configuration
public class FeignConfig {

    public Logger.Level feignLog(){
        return Logger.Level.FULL;
    }
}
