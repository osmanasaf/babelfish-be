package com.codefirst.babelfish.repository;

import com.codefirst.babelfish.model.Customer;
import com.codefirst.babelfish.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseRepository<Customer, Long> {
}
