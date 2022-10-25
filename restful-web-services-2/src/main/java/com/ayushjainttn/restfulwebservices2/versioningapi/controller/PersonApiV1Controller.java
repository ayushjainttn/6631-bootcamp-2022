package com.ayushjainttn.restfulwebservices2.versioningapi.controller;

import com.ayushjainttn.restfulwebservices2.versioningapi.entity.PersonV1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PersonApiV1Controller {

    @GetMapping(path = "/personapi/v1")
    public PersonV1 getPersonsUsingUri(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/personapi/param", params = "version=1")
    public PersonV1 getPersonsUsingRequestParameters(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/personapi/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonsUsingCustomHeader(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/personapi/accept", produces = "application/v1+json")
    public PersonV1 getPersonsUsingMimeType(){
        return new PersonV1("Ayush Jain");
    }
}
