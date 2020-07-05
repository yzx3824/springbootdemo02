package com.yzx.springboot.repository;

import com.yzx.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: spring-boot-06-data-jpa
 * @description: 继承JpaRepository来完成对数据库的操作继承JpaRepository来完成对数据库的操作
 * @author: yanzhixian
 * @create: 2020-07-05 13:36
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
