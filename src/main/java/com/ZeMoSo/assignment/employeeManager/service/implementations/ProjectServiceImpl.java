package com.ZeMoSo.assignment.employeeManager.service.implementations;

import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.datasource.Project;
import com.ZeMoSo.assignment.employeeManager.repository.EmployeeRepository;
import com.ZeMoSo.assignment.employeeManager.repository.ProjectRepository;
import com.ZeMoSo.assignment.employeeManager.service.interfaces.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project findProjectById(Long id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public List<Project> findAllProjects() {
        return (List<Project>) projectRepository.findAll();
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}
