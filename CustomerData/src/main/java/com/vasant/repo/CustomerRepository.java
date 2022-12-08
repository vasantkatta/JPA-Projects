package com.vasant.repo;

import org.springframework.data.repository.CrudRepository;

import com.vasant.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
