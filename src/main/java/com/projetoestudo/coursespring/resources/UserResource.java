package com.projetoestudo.coursespring.resources;


import com.projetoestudo.coursespring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Phillipe", "phillipe@outlook.com", "34999999", "12345678");

        return ResponseEntity.ok().body(u);
    }
}
