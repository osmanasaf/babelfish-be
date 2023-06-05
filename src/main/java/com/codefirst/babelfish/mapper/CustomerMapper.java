package com.codefirst.babelfish.mapper;

import com.codefirst.babelfish.dto.CustomerDto;
import com.codefirst.babelfish.model.Customer;
import com.codefirst.babelfish.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CustomerMapper extends Converter<CustomerDto, Customer, CustomerResponse> {
}
