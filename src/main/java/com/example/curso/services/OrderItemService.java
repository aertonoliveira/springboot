package com.example.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.entities.OrderItem;
import com.example.curso.repositoreis.OrderItemRepository;


@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository categoryRepository;
	
	public List<OrderItem> findAll(){
		return categoryRepository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = categoryRepository.findById(id);
		return obj.get();
	}
	

}
