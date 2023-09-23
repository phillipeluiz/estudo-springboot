package com.projetoestudo.coursespring.repositories;

import com.projetoestudo.coursespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {

}
