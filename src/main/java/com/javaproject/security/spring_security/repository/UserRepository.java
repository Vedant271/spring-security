package com.javaproject.security.spring_security.repository;

import com.javaproject.security.spring_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findUserByUsername(String username);
}
