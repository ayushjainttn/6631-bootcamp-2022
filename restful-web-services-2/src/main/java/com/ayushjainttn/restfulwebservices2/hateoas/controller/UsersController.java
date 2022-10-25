package com.ayushjainttn.restfulwebservices2.hateoas.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.ayushjainttn.restfulwebservices2.hateoas.entity.User;
import com.ayushjainttn.restfulwebservices2.hateoas.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping(path = "/hateoas/users")
    public List<User> getUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping(path = "/hateoas/users/{userId}")
    public EntityModel<User> getUserById(@PathVariable int userId){
        User user = usersService.findUserById(userId);
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }
}
