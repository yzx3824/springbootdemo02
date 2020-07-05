package com.yzx.springboot.mapper;

import com.yzx.springboot.bean.Employee;

/**
 * @program: spring-boot-06-data-mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-05 12:45
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
