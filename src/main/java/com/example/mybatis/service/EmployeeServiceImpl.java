package com.example.mybatis.service;

import com.example.mybatis.mapper.EmployeeMapper;
import com.example.mybatis.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeMapper employeeMapper;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeMapper.getAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeMapper.findById(id);
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeMapper.delete(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.update(employee);
    }
}