package com.webapplication.budgetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapplication.budgetapp.domain.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByUsername(String username);
}
