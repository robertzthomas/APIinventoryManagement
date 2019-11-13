package com.thomas.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.thomas.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
