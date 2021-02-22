package com.pushpraj.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pushpraj.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
