package com.example.app.model.Member.People;

public abstract class Person {
    private String name;
    private int tcNo;


    public Person(String name, int tcNo) {
        this.name = name;
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public int getTcNo() {
        return tcNo;
    }

    public abstract String whoYouAre();

}