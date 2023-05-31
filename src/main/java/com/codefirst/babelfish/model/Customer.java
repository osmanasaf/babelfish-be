package com.codefirst.babelfish.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String paymentTerm;
    @OneToMany(mappedBy = "customer")
    private List<Project> projects = new ArrayList<>() ;

}
