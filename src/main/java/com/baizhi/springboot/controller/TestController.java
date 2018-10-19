package com.baizhi.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/add")
    public String test(){
//        return "hello world";
        return "index";
    }
}
