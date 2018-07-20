package com.ZeMoSo.assignment.employeeManager.datasource;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="employee_name")
    @NotNull(message = "Employee name cannot be empty")
    private String employeename;
    @Column(name="employee_salary")
    private String employeesalary;
    @Column(name="employee_contactno")
    private String employeecontactno;

    @Valid
    @OneToMany
    @JoinColumn(name = "employee_id")
    Employee reportto;

    @Valid
    @ManyToOne
    @JoinColumn(name = "project_id")
    @NotNull(message = "Project is required to save the employee data")
    Project project;

    @Valid
    @ManyToOne
    @JoinColumn(name = "did")
    @NotNull(message = "Designation is required to save the employee data")
    Designation designation;

}

