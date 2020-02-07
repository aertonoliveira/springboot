package com.example.curso.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
