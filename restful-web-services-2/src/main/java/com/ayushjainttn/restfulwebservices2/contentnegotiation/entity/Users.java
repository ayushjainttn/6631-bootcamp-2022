package com.ayushjainttn.restfulwebservices2.contentnegotiation.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

//Lombok Annotations for auto generated getter, setter and no arguments constructor
@Getter @Setter @NoArgsConstructor
public class Users {
    @NotNull
    private String userName;

    public Users(String userName) {
        this.userName = userName;
    }
}
