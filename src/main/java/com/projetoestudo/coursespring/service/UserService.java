package com.projetoestudo.coursespring.service;

import com.projetoestudo.coursespring.entities.User;
import com.projetoestudo.coursespring.repositories.UserRepository;
import com.projetoestudo.coursespring.service.exceptions.DatabaseException;
import com.projetoestudo.coursespring.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
        return user.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Long id){
        try {
            userRepository.deleteById(id);
        }
        catch (ResourceNotFoundException e){
            throw new ResourceNotFoundException(e);
        }
        catch (DataIntegrityViolationException e)
        {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){

        try {
            User entity = userRepository.getReferenceById(id);
            updataData(entity, obj);
            return userRepository.save(entity);
        }
        catch (EntityNotFoundException e)
        {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updataData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }


}
