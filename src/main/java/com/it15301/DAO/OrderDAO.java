package com.it15301.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it15301.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{}