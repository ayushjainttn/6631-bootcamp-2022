package com.ayushjainttn.restfulwebservices2.versioningapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @NoArgsConstructor
public class PersonV1 {
    private String personName;

    public PersonV1(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "personName='" + personName + '\'' +
                '}';
    }
}
