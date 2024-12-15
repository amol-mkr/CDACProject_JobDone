package com.jobdone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobdone.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByCustomer_CustomerId(String customerId);
}
