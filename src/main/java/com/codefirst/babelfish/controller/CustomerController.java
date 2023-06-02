package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.Customer;
import com.codefirst.babelfish.repository.CustomerRepository;
import com.codefirst.babelfish.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController extends BaseController<Customer, Long, CustomerService> {

    public CustomerController(CustomerService customerService) {
        super(customerService);
    }

    @Override
    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer entity) {
        Customer createdCustomer = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer entity) {
        Customer updatedCustomer = service.update(id, entity);
        return ResponseEntity.ok(updatedCustomer);
    }

}
