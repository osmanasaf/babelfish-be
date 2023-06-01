package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.Customer;
import com.codefirst.babelfish.repository.CustomerRepository;
import com.codefirst.babelfish.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController extends BaseController<Customer, Long, CustomerService> {

    public CustomerController(CustomerService customerService) {
        super(customerService);
    }

}
