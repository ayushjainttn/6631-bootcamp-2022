package com.ayushjainttn.restfulwebservices2.hateoas.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor
public class User {
    private String userName;
    private String userEmail;
    private int userId;

    public User(String userName, String userEmail, int userId) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userId = userId;
    }
}
