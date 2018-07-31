package com.ZeMoSo.assignment.employeeManager.datasource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name="employee_name")
    @NotNull(message = "Employee name cannot be empty")
    private String employeename;

    @Column(name="employee_salary")
    private String employeesalary;

    @Column(name="employee_contactno")
    private String employeecontactno;

    @Valid
    @ManyToOne
    @JoinColumn(name = "project_id")
    Project project;

    @Valid
    @ManyToOne
    @JoinColumn(name = "did")
    Designation designation;


    @Valid
    @ManyToOne
    @JoinColumn(name = "report_to")
    Employee report_to;


    @JsonIgnore
    @OneToMany(mappedBy = "report_to", cascade = CascadeType.ALL)
    private Set<Employee> employee;


}

