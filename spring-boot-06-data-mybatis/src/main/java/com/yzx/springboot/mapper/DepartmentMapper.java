package com.yzx.springboot.mapper;

import com.yzx.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @program: spring-boot-06-data-mybatis
 * @description: 指定这是一个操作数据库的mapper
 * @author: yanzhixian
 * @create: 2020-07-05 12:23
 */
//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name = #{departmentName} where id = #{id}")
    public int updateDept(Department department);
}
