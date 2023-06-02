package com.codefirst.babelfish.service;

import com.codefirst.babelfish.model.Customer;
import com.codefirst.babelfish.repository.CustomerRepository;
import com.codefirst.babelfish.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer, Long, CustomerRepository> {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer create(Customer entity) {
        String companyName = entity.getCompanyName();
        if (existsByCompanyName(companyName)) {
            throw new IllegalArgumentException("Bu isimde bir müşteri zaten mevcut: " + companyName);
        }
        return super.create(entity);
    }

    @Override
    public Customer update(Long id, Customer entity) {
        String companyName = entity.getCompanyName();
        if (existsByCompanyName(companyName)) {
            throw new IllegalArgumentException("Bu isimde bir müşteri zaten mevcut: " + companyName);
        }
        return super.update(id, entity);
    }

    public boolean existsByCompanyName(String companyName) {
        return customerRepository.existsByCompanyName(companyName);
    }

}
