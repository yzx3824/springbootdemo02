package com.yzx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-01-helloworld-quick
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-17 23:37
 */
//这个类的所有方法返回的数据直接返回给浏览器  (如果是对象转换为json数据)
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    // RESTAPI方式
}
