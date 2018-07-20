package com.ZeMoSo.assignment.employeeManager.repository;
import com.ZeMoSo.assignment.employeeManager.datasource.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {



}
