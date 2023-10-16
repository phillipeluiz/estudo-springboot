package com.projetoestudo.coursespring.repositories;

import com.projetoestudo.coursespring.entities.OrderItem;
import com.projetoestudo.coursespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
