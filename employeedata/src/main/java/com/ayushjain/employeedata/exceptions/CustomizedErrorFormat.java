package com.ayushjain.employeedata.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CustomizedErrorFormat {
    private LocalDateTime timeStamp;
    private String message;
    private String description;
    public CustomizedErrorFormat(LocalDateTime timeStamp, String message, String description) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.description = description;
    }
}
