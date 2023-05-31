package com.codefirst.babelfish.service;

import com.codefirst.babelfish.model.Project;
import com.codefirst.babelfish.repository.ProjectRepository;
import com.codefirst.babelfish.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends BaseService<Project, Long, ProjectRepository> {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        super(projectRepository);
        this.projectRepository = projectRepository;
    }

}
