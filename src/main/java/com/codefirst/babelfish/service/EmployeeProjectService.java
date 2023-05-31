package com.codefirst.babelfish.service;

import com.codefirst.babelfish.model.EmployeeProject;
import com.codefirst.babelfish.repository.EmployeeProjectRepository;
import com.codefirst.babelfish.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProjectService extends BaseService<EmployeeProject, Long, EmployeeProjectRepository> {

    private final EmployeeProjectRepository employeeProjectRepository;

    public EmployeeProjectService(EmployeeProjectRepository employeeProjectRepository) {
        super(employeeProjectRepository);
        this.employeeProjectRepository = employeeProjectRepository;
    }

}