package com.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods here if needed
}
