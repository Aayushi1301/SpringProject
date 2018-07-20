package com.ZeMoSo.assignment.employeeManager.datasource;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Designation {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String designation;
    private Integer rank ;


    @JsonIgnore
    @OneToMany(mappedBy = "designation", cascade = CascadeType.ALL)
    private Set<Employee> employee;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}
