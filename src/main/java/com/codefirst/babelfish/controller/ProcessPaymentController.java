package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.ProcessPayment;
import com.codefirst.babelfish.repository.ProcessPaymentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/process-payment")
public class ProcessPaymentController extends BaseController<ProcessPayment, Long, ProcessPaymentRepository> {

    public ProcessPaymentController(ProcessPaymentRepository processPaymentRepository) {
        super(processPaymentRepository);
    }

}
