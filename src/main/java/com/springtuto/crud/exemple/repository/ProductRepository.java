package com.springtuto.crud.exemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtuto.crud.exemple.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	Product findByName(String name);
}