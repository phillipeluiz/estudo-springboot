package com.projetoestudo.coursespring.repositories;

import com.projetoestudo.coursespring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
