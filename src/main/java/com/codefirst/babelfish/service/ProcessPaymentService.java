package com.codefirst.babelfish.service;

import com.codefirst.babelfish.model.ProcessPayment;
import com.codefirst.babelfish.repository.ProcessPaymentRepository;
import com.codefirst.babelfish.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProcessPaymentService extends BaseService<ProcessPayment, Long, ProcessPaymentRepository> {

    private final ProcessPaymentRepository processPaymentRepository;

    public ProcessPaymentService(ProcessPaymentRepository processPaymentRepository) {
        super(processPaymentRepository);
        this.processPaymentRepository = processPaymentRepository;
    }

}
