package com.example.curso.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
