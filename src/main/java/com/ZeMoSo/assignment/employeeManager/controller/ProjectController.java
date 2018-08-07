package com.ZeMoSo.assignment.employeeManager.controller;
import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import com.ZeMoSo.assignment.employeeManager.datasource.Project;
import com.ZeMoSo.assignment.employeeManager.service.interfaces.EmployeeService;
import com.ZeMoSo.assignment.employeeManager.service.interfaces.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ZeMoSo.assignment.employeeManager.controller.ProjectController.PROJ_URL;

@RestController
@RequestMapping(ProjectController.BASE_URL+PROJ_URL)
public class ProjectController {
    public static final String BASE_URL="/api/v1";
    public static final String PROJ_URL="/projects/";
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @GetMapping
    List<Project> getAllProjects(){
        return projectService.findAllProjects();
    }

    @GetMapping("{id}/")
    public Project getProjectById(@PathVariable Long id){

        return projectService.findProjectById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Project saveProject(@RequestBody Project project){
        return projectService.saveProject(project);

    }
}
