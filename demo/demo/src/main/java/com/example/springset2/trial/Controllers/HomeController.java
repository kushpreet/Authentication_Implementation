package com.example.springset2.trial.Controllers;

import com.example.springset2.trial.models.User;
import com.example.springset2.trial.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
            public UserService userService;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/test")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing message";
    }
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUsers();

    }


}