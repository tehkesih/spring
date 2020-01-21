package com.tehkesih.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import com.tehkesih.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
