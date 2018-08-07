package com.ZeMoSo.assignment.employeeManager.bootstrap;

import com.ZeMoSo.assignment.employeeManager.datasource.Designation;
import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.datasource.Project;
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
        Project p1=new Project();
        p1.id=1;
        e1.setProject(p1);
        Designation d1=new Designation();
        d1.id=1;
        e1.setDesignation(d1);
        e1.setReport_to(null);
        mEmployeeRepository.save(e1);

        Employee e2=new Employee();
        e2.setEmployeename("Aakriti");
        e2.setEmployeesalary("Rs60000");
        e2.setEmployeecontactno("+919198756726");
        Project p2=new Project();
        p2.id=2;
        e1.setProject(p2);
        Designation d2=new Designation();
        d2.id=1;
        e2.setDesignation(d2);
        Employee e21=new Employee();
        e21.id=1;
        e2.setReport_to(e21);
        mEmployeeRepository.save(e2);

        Employee e3=new Employee();
        e3.setEmployeename("Aarushi");
        e3.setEmployeesalary("Rs70000");
        e3.setEmployeecontactno("+919187654326");
        Project p3=new Project();
        p3.id=3;
        e1.setProject(p3);
        Designation d3=new Designation();
        d3.id=3;
        e1.setDesignation(d3);
        Employee e31=new Employee();
        e31.id=2;
        e3.setReport_to(e31);
        mEmployeeRepository.save(e3);
        System.out.println("Employeess saved:"+mEmployeeRepository.count());

    }
}
