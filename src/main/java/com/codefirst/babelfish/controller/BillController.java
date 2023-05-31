package com.codefirst.babelfish.controller;

import com.codefirst.babelfish.controller.base.BaseController;
import com.codefirst.babelfish.model.Bill;
import com.codefirst.babelfish.repository.BillRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bill")
public class BillController extends BaseController<Bill, Long, BillRepository> {

    public BillController(BillRepository billRepository) {
        super(billRepository);
    }

}
