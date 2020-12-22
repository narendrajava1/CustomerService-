package com.naren.intract.mappers;

import org.mapstruct.Mapper;

import com.naren.intract.entity.CustomerEntity;
import com.naren.intract.model.Customer;

@Mapper
public interface CustomerMapper {
	Customer toCustomerDTO(CustomerEntity customerEntity);
	CustomerEntity toCustomerEntity(Customer customer);

}
