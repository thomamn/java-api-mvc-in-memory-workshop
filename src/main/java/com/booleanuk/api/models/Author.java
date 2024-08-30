package com.booleanuk.api.models;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Author {
    private static int nextID=1;

    private int id;
    private String name;
    private String email;

    public Author(String name, String email){
        this.id=nextID;
        nextID++;
        this.name=name;
        this.email=email;
    }

    public Author(String name){
        this.id=nextID;
        nextID++;
        this.name=name;
        this.email=name+"@mail.com";
    }

    public Author(){
        this.id=nextID;
        nextID++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
