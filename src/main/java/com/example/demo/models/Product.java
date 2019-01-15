/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 *
 * @author Cezar
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen3")

    private long productId;

    @OneToMany(mappedBy = "product")
    private List<OrderDetails> orderp = new ArrayList<OrderDetails>();

    private String name;

    private String description;

    public Product() {

    }

    public Product(String name, String description) {

        this.name = name;
        this.description = description;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public List<OrderDetails> getOrderp() {
        return orderp;
    }

    public void setOrderp(List<OrderDetails> orderp) {
        this.orderp = orderp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public long getProductid() {
        return productId;
    }

    public void setProductid(Integer product_id) {
        this.productId = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
}
