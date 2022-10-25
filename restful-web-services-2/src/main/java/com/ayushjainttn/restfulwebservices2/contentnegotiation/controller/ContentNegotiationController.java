package com.ayushjainttn.restfulwebservices2.contentnegotiation.controller;

import com.ayushjainttn.restfulwebservices2.contentnegotiation.entity.Users;
import com.ayushjainttn.restfulwebservices2.contentnegotiation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ContentNegotiationController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/get")
    public List<Users> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(path = "/users/post")
    public ResponseEntity<Users> addUsers(@Valid @RequestBody Users user){
        Users newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
