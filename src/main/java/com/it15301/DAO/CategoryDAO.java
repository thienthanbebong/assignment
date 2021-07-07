package com.it15301.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it15301.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{}
