package com.company;

import java.util.Scanner;

public class Person {
    //name, dob, numOfTel, address
    private String name;
    private String dob;
    private String numOfTel;
    private String address;

    Person () {

    }

    Person(String name, String dob, String numOfTel, String address) {
        this.name = name;
        this.dob = dob;
        this.numOfTel = numOfTel;
        this.address = address;
    }

    private void show() {
        System.out.println("Name: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }
}
