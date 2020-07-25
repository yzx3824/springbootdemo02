package com.yzx.springboot.entities;

/**
 * @program: spring-boot-04-web-restfulcrud
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-24 19:04
 */
public class Department {
    private Integer id;
    private String departmentName;

    public Department() {
    }

    public Department(int i, String string) {
        this.id = i;
        this.departmentName = string;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", departmentName=" + departmentName + "]";
    }
}
