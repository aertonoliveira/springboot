package com.example.curso.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
