package com.ZeMoSo.assignment.employeeManager.bootstrap;

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

    }
}
