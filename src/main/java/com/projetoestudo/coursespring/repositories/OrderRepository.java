package com.projetoestudo.coursespring.repositories;

import com.projetoestudo.coursespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Long> {
}
