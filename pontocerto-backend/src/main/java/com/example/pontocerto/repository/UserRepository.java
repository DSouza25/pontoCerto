package com.example.pontocerto.repository;

import com.example.pontocerto.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
