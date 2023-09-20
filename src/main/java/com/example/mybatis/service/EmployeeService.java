package com.example.mybatis.service;

import com.example.mybatis.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    void updateEmployee(Employee employee);
}
