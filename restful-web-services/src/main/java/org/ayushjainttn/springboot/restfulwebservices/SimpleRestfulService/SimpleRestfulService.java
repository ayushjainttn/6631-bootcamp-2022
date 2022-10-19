package org.ayushjainttn.springboot.restfulwebservices.SimpleRestfulService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestfulService {

    @RequestMapping(method= RequestMethod.GET, path="/" )
    public String simpleRestfulService(){
        return "Welcome to Spring Boot!";
    }
}
