package com.projetoestudo.coursespring.service;

import com.projetoestudo.coursespring.entities.Product;
import com.projetoestudo.coursespring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll(){
        return ProductRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> product = ProductRepository.findById(id);
        return product.get();
    }

}
