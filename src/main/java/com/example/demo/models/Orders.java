/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Cezar
 */
@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen2")

    private long orderId;

    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderd = new ArrayList<OrderDetails>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_UserId")
    private User user;

    public Orders() {
    }

    public Orders(User user, Date orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }

    @NotNull
    private Date orderDate;

    public long getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public List<OrderDetails> getOrderd() {
        return orderd;
    }

    public void setOrderd(List<OrderDetails> orderd) {
        this.orderd = orderd;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


 
   
        
}
