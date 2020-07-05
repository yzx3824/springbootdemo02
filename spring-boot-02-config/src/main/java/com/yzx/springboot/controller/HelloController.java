package com.yzx.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-02-config
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-20 19:36
 */
@RestController
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello " + name;
    }
}
