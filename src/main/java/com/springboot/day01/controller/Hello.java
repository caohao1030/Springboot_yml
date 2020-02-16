package com.springboot.day01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//此注解是Controller然后标记为返回值是字符串类型
@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
     return "hello，World";
    }
}
