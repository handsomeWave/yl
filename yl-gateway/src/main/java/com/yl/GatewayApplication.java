package com.yl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yangshuaibo
 */
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
//        new SpringApplicationBuilder(
//                GatewayApplication.class)
//                .web(WebApplicationType.REACTIVE).run(args);
//        SpringApplication application = new SpringApplication(GatewayApplication.class);
//        // 该设置方式
//        application.setWebApplicationType(WebApplicationType.REACTIVE);
//        application.run(args);
    }
}
