package com.yl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * yangshuaibo
 *
 * @author Yangshuaibo
 */
@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

    @RequestMapping("/del")
    public String del(){
        System.out.println("删除成功");
        return "删除成功";
    }
}
