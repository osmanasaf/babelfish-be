package com.codefirst.babelfish.service;

import com.codefirst.babelfish.dto.CustomerDto;
import com.codefirst.babelfish.mapper.CustomerMapper;
import com.codefirst.babelfish.model.Customer;
import com.codefirst.babelfish.repository.CustomerRepository;
import com.codefirst.babelfish.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer, Long, CustomerRepository> {

    private final CustomerRepository customerRepository;
    @Autowired
    private  CustomerMapper customerMapper;


    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    public Customer create(CustomerDto dto) {
        String companyName = dto.getCompanyName();
        if (existsByCompanyName(companyName)) {
            throw new IllegalArgumentException("Bu isimde bir müşteri zaten mevcut: " + companyName);
        }
        Customer entity = customerMapper.toEntity(dto);
        return repository.save(entity);
    }

    public Customer update(Long id, CustomerDto dto) {
        String companyName = dto.getCompanyName();
        if (existsByCompanyName(companyName)) {
            throw new IllegalArgumentException("Bu isimde bir müşteri zaten mevcut: " + companyName);
        }
        Customer entity = customerMapper.toEntity(dto);
        return super.update(id, entity);
    }

    public boolean existsByCompanyName(String companyName) {
        return customerRepository.existsByCompanyName(companyName);
    }

}
