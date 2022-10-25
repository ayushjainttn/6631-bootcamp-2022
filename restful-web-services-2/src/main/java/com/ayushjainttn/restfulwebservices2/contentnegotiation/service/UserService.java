package com.ayushjainttn.restfulwebservices2.contentnegotiation.service;

import com.ayushjainttn.restfulwebservices2.contentnegotiation.entity.Users;

import java.util.List;

public interface UserService {
    public List<Users> getAllUsers();
    public Users addUser(Users user);
}
