package com.company;

import com.sun.jdi.LocalVariable;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Client extends Person {
    private String clientID;
    private String driverLicense;

    Client (String name, String dob, String numOfTel, String address, String driverLicense) {
        super(name, dob, numOfTel, address);

        this.driverLicense = driverLicense;
        clientID = name.substring(0, 2) + dob;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        int age = Period.between(LocalDate.parse(super.getDOB()), LocalDate.now()).getYears();
        return age;
    }

}
