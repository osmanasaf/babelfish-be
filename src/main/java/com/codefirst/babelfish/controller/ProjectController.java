package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.Project;
import com.codefirst.babelfish.repository.ProjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController extends BaseController<Project, Long, ProjectRepository> {

    public ProjectController(ProjectRepository projectRepository) {
        super(projectRepository);
    }

}
