package com.yzx.springboot.controller;

import com.yzx.springboot.bean.Department;
import com.yzx.springboot.bean.Employee;
import com.yzx.springboot.mapper.DepartmentMapper;
import com.yzx.springboot.mapper.EmployeeMapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-06-data-mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-05 12:29
 */
@RestController
public class DeptmentController {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    //http://localhost:8080/dept/1
    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    //http://localhost:8080/dept?departmentName=aa
    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    //http://localhost:8080/emp/1
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

    //http://localhost:8080/emp?lastName=aa&gender=1&email=yzx@qq.com&dId=1
    @GetMapping("/emp")
    public Employee insertEmp(Employee employee) {
        employeeMapper.insertEmp(employee);
        return employee;
    }
}
