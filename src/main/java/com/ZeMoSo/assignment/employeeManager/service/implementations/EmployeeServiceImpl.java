package com.ZeMoSo.assignment.employeeManager.service.implementations;

import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.repository.EmployeeRepository;
import com.ZeMoSo.assignment.employeeManager.service.interfaces.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

