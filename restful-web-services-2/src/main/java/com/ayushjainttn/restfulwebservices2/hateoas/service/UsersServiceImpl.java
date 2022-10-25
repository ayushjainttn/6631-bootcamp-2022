package com.ayushjainttn.restfulwebservices2.hateoas.service;

import com.ayushjainttn.restfulwebservices2.hateoas.entity.User;
import com.ayushjainttn.restfulwebservices2.hateoas.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersRepository usersRepository;

    public List<User> getAllUsers(){
        return usersRepository.retrieveUsers();
    }

    public User findUserById(int userId){
        Predicate<? super User> predicate = user -> user.getUserId() == userId;
        User user = usersRepository.retrieveUsers().stream().filter(predicate).findFirst().get();
        return user;
    }
}
