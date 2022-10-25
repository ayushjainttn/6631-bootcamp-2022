package com.ayushjainttn.restfulwebservices2.hateoas.repository;

import com.ayushjainttn.restfulwebservices2.hateoas.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository {
    private static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("Ayush","ayush@gmail.com",11));
        userList.add(new User("Vaibhav", "vai@yahoo.com", 12));
        userList.add(new User("Hitesh", "hitesh@rediff.com",13));
    }

    public List<User> retrieveUsers(){
        return userList;
    }
}
