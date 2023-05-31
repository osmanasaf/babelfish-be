package com.codefirst.babelfish.service;

import com.codefirst.babelfish.model.Bill;
import com.codefirst.babelfish.repository.BillRepository;
import com.codefirst.babelfish.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BillService extends BaseService<Bill, Long, BillRepository> {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        super(billRepository);
        this.billRepository = billRepository;
    }

}
