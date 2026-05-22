package com.ajay.microservices.ajay_product_service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.microservices.ajay_product_service.model.Product;

public interface ProductoryRepository extends JpaRepository<Product, Long> {

}
