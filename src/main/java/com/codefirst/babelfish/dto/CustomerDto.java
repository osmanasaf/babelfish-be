package com.codefirst.babelfish.dto;

import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {

    private String companyName;
    private String paymentTerm;
    private List<ProjectDto> projects;
}
