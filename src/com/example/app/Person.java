package com.example.app;

public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }


    public String whoYouAre(){
        return name;
    }

}