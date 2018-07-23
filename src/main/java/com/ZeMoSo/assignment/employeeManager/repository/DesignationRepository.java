package com.ZeMoSo.assignment.employeeManager.repository;

import com.ZeMoSo.assignment.employeeManager.datasource.Designation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends CrudRepository<Designation, Long> {
}