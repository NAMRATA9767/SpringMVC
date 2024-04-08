package com.technodrom.productdetails.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technodrom.productdetails.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
