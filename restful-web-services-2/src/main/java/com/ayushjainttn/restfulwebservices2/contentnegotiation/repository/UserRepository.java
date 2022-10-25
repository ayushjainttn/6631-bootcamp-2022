package com.ayushjainttn.restfulwebservices2.contentnegotiation.repository;

import com.ayushjainttn.restfulwebservices2.contentnegotiation.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static List<Users> userList = new ArrayList<>();
    static {
        userList.add(new Users("Ayush"));
        userList.add(new Users("Praveen"));
        userList.add(new Users("Hitesh"));
        userList.add(new Users("Ravi"));
        userList.add(new Users("Aarav"));
    }

    public List<Users> retrieveUsers(){
        return userList;
    }

    public Users addNewUsers(Users user){
        userList.add(user);
        return user;
    }
}
