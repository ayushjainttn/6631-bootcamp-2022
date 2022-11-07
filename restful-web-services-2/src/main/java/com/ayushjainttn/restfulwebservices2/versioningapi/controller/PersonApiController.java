package com.ayushjainttn.restfulwebservices2.versioningapi.controller;

import com.ayushjainttn.restfulwebservices2.versioningapi.entity.PersonName;
import com.ayushjainttn.restfulwebservices2.versioningapi.entity.PersonV1;
import com.ayushjainttn.restfulwebservices2.versioningapi.service.PersonApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personapi")
public class PersonApiV1Controller {

    @Autowired
    private PersonName personName;

    @GetMapping(path = "/v1")
    public String getPersonsUsingUriV1(){
        personName.setName("Ayush Jain");
        return personName.getName();
    }

    @GetMapping(path = "/v2")
    public PersonV1 getPersonsUsingUriV2(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/param", params = "version=1")
    public PersonV1 getPersonsUsingRequestParameters(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonsUsingCustomHeader(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/accept", produces = "application/v1+json")
    public PersonV1 getPersonsUsingMimeType(){
        return new PersonV1("Ayush Jain");
    }
}
