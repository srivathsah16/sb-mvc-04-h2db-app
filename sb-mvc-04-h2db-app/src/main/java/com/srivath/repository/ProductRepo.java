package com.srivath.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srivath.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
