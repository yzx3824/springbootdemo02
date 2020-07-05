package com.yzx.springboot.bean;

/**
 * @program: spring-boot-06-data-mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-27 23:46
 */
public class Department {
    private Integer id;
    private String departmentName;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
