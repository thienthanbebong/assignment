package com.it15301.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it15301.entity.Account;

public interface AccountDAO extends JpaRepository<Account, String>{
	
}
