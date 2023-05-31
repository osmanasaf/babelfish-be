package com.codefirst.babelfish.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}