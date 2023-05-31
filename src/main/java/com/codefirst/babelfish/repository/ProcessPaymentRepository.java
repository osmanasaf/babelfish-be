package com.codefirst.babelfish.repository;

import com.codefirst.babelfish.model.ProcessPayment;
import com.codefirst.babelfish.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessPaymentRepository extends BaseRepository<ProcessPayment, Long> {

}
