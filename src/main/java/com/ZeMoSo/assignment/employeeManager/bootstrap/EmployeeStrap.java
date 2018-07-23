package com.ZeMoSo.assignment.employeeManager.bootstrap;

import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeStrap implements CommandLineRunner {
    @Autowired
    private EmployeeRepository mEmployeeRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading employee Data");
        Employee e1=new Employee();
        e1.setEmployeename("Aayushi");
        e1.setEmployeesalary("Rs50000");
        e1.setEmployeecontactno("+919187654326");
        mEmployeeRepository.save(e1);

        Employee e2=new Employee();
        e2.setEmployeename("Aakriti");
        e2.setEmployeesalary("Rs60000");
        e2.setEmployeecontactno("+919198756726");
        mEmployeeRepository.save(e2);

        Employee e3=new Employee();
        e3.setEmployeename("Aarushi");
        e3.setEmployeesalary("Rs70000");
        e3.setEmployeecontactno("+919187654326");
        mEmployeeRepository.save(e3);
        System.out.println("Employeess saved:"+mEmployeeRepository.count());

    }
}
