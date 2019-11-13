package com.thomas.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.thomas.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
