package com.codefirst.babelfish.repository;

import com.codefirst.babelfish.model.Project;
import com.codefirst.babelfish.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends BaseRepository<Project, Long> {
}
