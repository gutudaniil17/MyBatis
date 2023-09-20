package com.example.mybatis.mapper;

import com.example.mybatis.model.Employee;
import java.util.List;

import org.apache.ibatis.annotations.*;


@Mapper
public interface EmployeeMapper {

    @Select("Select * from Employees")
    List<Employee> getAll();

    @Insert("Insert Into Employees(first_name,last_name,email) " +
            "values (#{first_name}, #{last_name}, #{email})")
    void insertEmployee(Employee employee);

    @Select("Select id , first_name, last_name, email " +
            "from Employees where id = #{id}")
    Employee findById(long id);

    @Delete("Delete from Employees " +
            "where id = #{id} ")
    void delete(long id);

    @Update("Update Employees " +
            "set first_name = #{first_name} , last_name = #{last_name} , email = #{email} " +
            "where id = #{id}")
    void update(Employee employee);
}
