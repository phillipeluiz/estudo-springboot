package com.projetoestudo.coursespring.repositories;

import com.projetoestudo.coursespring.entities.Category;
import com.projetoestudo.coursespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
