package com.auth.jwt.repository;

import com.auth.jwt.entity.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Integer> {

    //Obtener usuarios por su username
    Optional<AuthUser> findByUserName(String userName);
}
