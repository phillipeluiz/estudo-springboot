package com.projetoestudo.coursespring.service;

import com.projetoestudo.coursespring.entities.User;
import com.projetoestudo.coursespring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public User update(Long id, User obj){
        User entity = userRepository.getReferenceById(id);
        updataData(entity, obj);
        return userRepository.save(entity);
    }

    private void updataData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }


}
