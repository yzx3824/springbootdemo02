package com.yzx.springboot.exception;

/**
 * @program: spring-boot-04-web-restfulcrud
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-29 22:43
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
