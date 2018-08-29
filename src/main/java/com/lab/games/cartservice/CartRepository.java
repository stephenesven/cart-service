package com.lab.games.cartservice;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartItem, Integer> {
    CartItem[] findByCustomer(String customer);
}