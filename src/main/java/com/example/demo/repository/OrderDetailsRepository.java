/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.models.OrderDetails;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cezar
 */

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {

    
 
}