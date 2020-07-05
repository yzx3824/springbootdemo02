package com.yzx.springboot.controller;

import com.yzx.springboot.entity.User;
import com.yzx.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-06-data-jpa
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-05 13:37
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    //http://localhost:8080/user/1
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findOne(id);
        return user;
    }

    //http://localhost:8080/user?lastName=aa&email=yzx.com
    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }
}
