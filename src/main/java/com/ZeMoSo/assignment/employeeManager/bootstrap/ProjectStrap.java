package com.ZeMoSo.assignment.employeeManager.bootstrap;

import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.datasource.Project;
import com.ZeMoSo.assignment.employeeManager.repository.EmployeeRepository;
import com.ZeMoSo.assignment.employeeManager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProjectStrap implements CommandLineRunner {
    @Autowired
    private ProjectRepository mProjectRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading projects Data");
        Project p1=new Project();
        p1.setProjecttitle("Calculator App");
        mProjectRepository.save(p1);

        Project p2=new Project();
        p2.setProjecttitle("Restaurant App");
        mProjectRepository.save(p2);

        Project p3=new Project();
        p3.setProjecttitle("Cab App");
        mProjectRepository.save(p3);
        System.out.println("Projects saved:"+mProjectRepository.count());


    }
}
