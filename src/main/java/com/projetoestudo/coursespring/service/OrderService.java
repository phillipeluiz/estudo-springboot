package com.projetoestudo.coursespring.service;

import com.projetoestudo.coursespring.entities.Order;
import com.projetoestudo.coursespring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> order = repository.findById(id);
        return order.get();
    }

}
