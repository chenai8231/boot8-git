package com.czf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @RequestMapping("hi")
    public String sayHi(){
        return "Hello SpringBoot 项目经理123 ";
    }
}
