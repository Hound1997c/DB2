package com.example.demo.repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.example.demo.models.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cezar
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    
 
}