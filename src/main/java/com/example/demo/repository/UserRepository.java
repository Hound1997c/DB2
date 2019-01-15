package com.example.demo.repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Cezar
 */

import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;


//@Repository("userRepository")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}