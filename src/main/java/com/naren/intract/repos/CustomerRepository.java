package com.naren.intract.repos;

import org.springframework.data.repository.CrudRepository;

import com.naren.intract.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}
