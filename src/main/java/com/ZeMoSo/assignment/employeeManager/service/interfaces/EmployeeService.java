package com.ZeMoSo.assignment.employeeManager.service.interfaces;

import com.ZeMoSo.assignment.employeeManager.datasource.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findEmployeeById(Long id);
    List<Employee> findAllEmployees();

    Employee saveEmployee(Employee employee);

}
