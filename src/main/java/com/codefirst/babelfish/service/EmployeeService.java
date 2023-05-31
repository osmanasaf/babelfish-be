package com.codefirst.babelfish.service;

import com.codefirst.babelfish.model.Employee;
import com.codefirst.babelfish.repository.EmployeeRepository;
import com.codefirst.babelfish.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends BaseService<Employee, Long, EmployeeRepository> {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        super(employeeRepository);
        this.employeeRepository = employeeRepository;
    }

}
