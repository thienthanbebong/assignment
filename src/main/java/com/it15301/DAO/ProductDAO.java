package com.it15301.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it15301.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
	
}
