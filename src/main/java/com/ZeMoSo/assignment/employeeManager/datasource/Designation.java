package com.ZeMoSo.assignment.employeeManager.datasource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Designation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer id;

    private String designation;
    private Integer rank ;

    @JsonIgnore
    @OneToMany(mappedBy = "designation", cascade = CascadeType.ALL)
    private Set<Employee> employee;





}
