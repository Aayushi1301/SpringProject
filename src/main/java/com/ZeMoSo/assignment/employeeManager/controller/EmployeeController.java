package com.ZeMoSo.assignment.employeeManager.controller;

import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.service.interfaces.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(EmployeeController.BASE_URL)
public class EmployeeController {
    public static final String BASE_URL="/api/v1/employees";
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){

        return employeeService.findEmployeeById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);

    }

}
