package com.example.springset2.trial.repositories;

import com.example.springset2.trial.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    public Optional<User> findByEmail(String email);
}
