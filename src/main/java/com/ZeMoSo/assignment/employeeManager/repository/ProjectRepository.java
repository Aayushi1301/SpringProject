package com.ZeMoSo.assignment.employeeManager.repository;

import com.ZeMoSo.assignment.employeeManager.datasource.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>{

}
