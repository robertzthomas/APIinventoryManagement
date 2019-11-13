package com.thomas.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.thomas.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
