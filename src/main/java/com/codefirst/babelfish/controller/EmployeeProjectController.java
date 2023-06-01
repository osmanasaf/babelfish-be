package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.EmployeeProject;
import com.codefirst.babelfish.repository.EmployeeProjectRepository;
import com.codefirst.babelfish.service.EmployeeProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-project")
public class EmployeeProjectController extends BaseController<EmployeeProject, Long, EmployeeProjectService> {

    public EmployeeProjectController(EmployeeProjectService employeeProjectService) {
        super(employeeProjectService);
    }

}

