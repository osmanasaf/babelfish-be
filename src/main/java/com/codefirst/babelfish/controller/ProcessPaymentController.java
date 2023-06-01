package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.ProcessPayment;
import com.codefirst.babelfish.repository.ProcessPaymentRepository;
import com.codefirst.babelfish.service.ProcessPaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process-payment")
public class ProcessPaymentController extends BaseController<ProcessPayment, Long, ProcessPaymentService> {

    public ProcessPaymentController(ProcessPaymentService processPaymentService) {
        super(processPaymentService);
    }

}
