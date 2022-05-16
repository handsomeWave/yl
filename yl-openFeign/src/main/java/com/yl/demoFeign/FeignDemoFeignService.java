package com.yl.demoFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * yang
 *
 * @author Yangshuaibo
 */
@FeignClient(name = "yl-demo2",path = "/demo2")
public interface FeignDemoFeignService {

    @RequestMapping("/del")
    String del();

}
