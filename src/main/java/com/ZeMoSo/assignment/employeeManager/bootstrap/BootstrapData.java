package com.ZeMoSo.assignment.employeeManager.bootstrap;

import com.ZeMoSo.assignment.employeeManager.datasource.Designation;
import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.datasource.Project;
import com.ZeMoSo.assignment.employeeManager.repository.DesignationRepository;
import com.ZeMoSo.assignment.employeeManager.repository.EmployeeRepository;
import com.ZeMoSo.assignment.employeeManager.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;
    private final DesignationRepository designationRepository;
    private final ProjectRepository projectRepository;

    public BootstrapData(EmployeeRepository employeeRepository, DesignationRepository designationRepository, ProjectRepository projectRepository) {
        this.employeeRepository = employeeRepository;
        this.designationRepository = designationRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Employee Data");
        Employee e=new Employee();
        e.setEmployee_name("Aayushi");
        e.setEmployee_salary("48000");
        e.setEmployee_contactno("+919162503869");


        employeeRepository.save(e);
        System.out.println("Employee saved:"+ employeeRepository.count());


        System.out.println("Loading Designation Data");
        Designation d=new Designation();

        designationRepository.save(d);
        System.out.println("Designation saved:"+ designationRepository.count());


        System.out.println("Loading Project Data");
        Project p=new Project();

        projectRepository.save(p);
        System.out.println("Project saved:"+ projectRepository.count());
    }
}
