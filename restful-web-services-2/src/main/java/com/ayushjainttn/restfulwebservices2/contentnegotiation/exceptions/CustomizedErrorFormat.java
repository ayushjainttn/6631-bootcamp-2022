package com.ayushjainttn.restfulwebservices2.contentnegotiation.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor
public class CustomizedErrorFormat {
    //timestamp
    private LocalDateTime timeStamp;
    //message
    private String message;

    public CustomizedErrorFormat(LocalDateTime timeStamp, String message) {
        this.timeStamp = timeStamp;
        this.message = message;
    }
}
