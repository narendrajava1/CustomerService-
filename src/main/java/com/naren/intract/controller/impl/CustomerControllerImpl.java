package com.naren.intract.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naren.intract.mappers.CustomerMapper;
import com.naren.intract.model.Customer;
import com.naren.intract.repos.CustomerRepository;

@RestController
public class CustomerControllerImpl {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	CustomerMapper customerMapper;

	@PostMapping("/createCustomer")
	public Customer createCustomer(@RequestBody Customer customer) {

		return customerMapper.toCustomerDTO(customerRepository.save(customerMapper.toCustomerEntity(customer)));

	}

}
