package com.example.curso.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
