package com.yzx.springboot.controller;

import com.yzx.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: spring-boot-04-web-restfulcrud
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-04 11:02
 */
@Controller
public class HelloController {

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }

//    @ResponseBody
//    @RequestMapping({"/hello"})
//    public String hello(){
//        return "hello";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }

//    @RequestMapping("/success")
//    public String success(){
//        // classpath:/templates/success.html
//        return "success";
//    }

    //查出用户数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users",Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
