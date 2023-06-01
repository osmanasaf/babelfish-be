package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.Project;
import com.codefirst.babelfish.repository.ProjectRepository;
import com.codefirst.babelfish.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController extends BaseController<Project, Long, ProjectService> {

    public ProjectController(ProjectService projectService) {
        super(projectService);
    }
}
