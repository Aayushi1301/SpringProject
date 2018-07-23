package com.ZeMoSo.assignment.employeeManager.service.interfaces;

import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.datasource.Project;

import java.util.List;

public interface ProjectService {
    Project findProjectById(Long id);
    List<Project> findAllProjects();

    Project saveProject(Project project);

}
