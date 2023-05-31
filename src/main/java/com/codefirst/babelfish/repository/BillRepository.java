package com.codefirst.babelfish.repository;

import com.codefirst.babelfish.model.Bill;
import com.codefirst.babelfish.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends BaseRepository<Bill, Long> {
}
