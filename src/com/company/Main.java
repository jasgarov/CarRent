package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Main {

//    Car = numOfPassengers, pricePerDay, carClass, registrationNum,
//    DriverLicense = licenseNumber, issuedOnDate, expiryDate, vehicleType, owner
//            Client = name, dob, numOfTel, address, clientID
//    Manager = name, dob, numOfTel, address, employeeID, salary, position
//            Payment = dateOfPayment, amount
//    Insurance = insuranceID, expiryDate, amountInsured, isCasco, owner
//            DealerBranch = address, phoneNum, topManager
//    Rent = date, duration, Car, Client, Manager, Insurance, DealerBranch, Payment

    public static void main(String[] args) {
	// write your code here
        LocalDate localDate = LocalDate.now();
        Date date = new Date();

        LocalDate nextYear = LocalDate.of(2020, 03, 20);
        LocalDate parseDate = LocalDate.parse("2020-03-20");

        System.out.println(localDate);
        System.out.println(nextYear);
        System.out.println(parseDate);

        int age = Period.between(LocalDate.parse("1991-06-10"), LocalDate.now()).getYears();

        System.out.println(age);
    }
}
