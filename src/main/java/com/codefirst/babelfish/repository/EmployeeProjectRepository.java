package com.codefirst.babelfish.repository;

import com.codefirst.babelfish.model.EmployeeProject;
import com.codefirst.babelfish.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProjectRepository extends BaseRepository<EmployeeProject, Long> {
}
