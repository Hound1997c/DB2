/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

/**
 *
 * @author Cezar
 */



import com.example.demo.repository.OrdersRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.models.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController{
    /*
@Autowired 
private UserRepository userRepository;

    @RequestMapping("/users")
    String products() throws ParseException {
        SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateformat3.parse("09/09/1999");

        userRepository.save(new User("XXXXXX", "XXXski", "XXXXXXXX@gmail.com", date1));

        return "users";
    }

    @Autowired
    private OrdersRepository ordersRepository;

    @RequestMapping("/users/orders")
    String addOrder() throws ParseException {
        SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateformat3.parse("05/07/2017");

        Orders ord = new Orders(userRepository.findById((long) 1).get(), date1);

        ordersRepository.save(ord);

        return "orders";
    }

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderDetailsRepository orderdetailsRepository;

    @RequestMapping("/users/orders/orderdetails")
    String addOrderdetails() {

        Orders o = ordersRepository.findById((long) 1).get();
        Product p = productRepository.findById((long) 1).get();

        if (o == null) {
            System.out.println("Order is null!!!");
        }

        if (p == null) {
            System.out.println("product is null!!!");
        }

        OrderDetails od = new OrderDetails(120, o, p);

        if (od == null) {
            System.out.println("order details is null!!!");
        }

        orderdetailsRepository.save(od);

        return "orderdetails";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    String signUp() {

        return "signUp";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    String signed(@RequestParam(value = "firstname", required = false) String firstname,
            @RequestParam(value = "lastname", required = false) String lastname, @RequestParam(value = "password", required = false) String password, @RequestParam(value = "email", required = false) String email, @RequestParam(value = "birthday", required = false) String birthday, Model model) throws ParseException {

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);

        System.out.println(firstname + " " + lastname + " " + email + " " + birthday);
        userRepository.save(new User(firstname, lastname, password, email, date1));
        return "processForm";
    }  */
  

    
}