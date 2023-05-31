package com.codefirst.babelfish.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    // maybe we should use bankAccount entity here
    private String iban;
    private BigDecimal salary;
    private BigDecimal bonus;
    private String additionalInfo;

//    @OneToMany(mappedBy = "employee")
//    private List<EmployeeProjects> employeeProjects = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "employee_projects_id")
    private EmployeeProject employeeProjects;

}
