package com.yl.controller;

import com.yl.demoFeign.FeignDemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * yangshuaibo
 *
 * @author Yangshuaibo
 */
@RestController
@RequestMapping("/demo1")
public class demo1Controller {

    @Autowired
   private FeignDemoFeignService feignDemoFeignService;

    @RequestMapping("/add")
    public String add(){
        System.out.println("添加成功");
        String msg = feignDemoFeignService.del();
        return msg;
    }
}
