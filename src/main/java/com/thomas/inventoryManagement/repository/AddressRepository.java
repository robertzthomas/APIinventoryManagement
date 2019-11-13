package com.thomas.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.thomas.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address,Long> {

	
}
