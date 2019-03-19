package com.company;

import java.time.LocalDate;

public class RentContract {
    //date, duration, Car, Client, Manager, Insurance, DealerBranch, Payment
    private String date;
    private int duration;
    private Car car;
    private Client client;
    private Manager manager;
    private Insurance insurance;
    private String dealerBranchName;
    private double payment;
    boolean isCarReturned;

    public void showInfo() {
        System.out.println("Date: " + date);
        System.out.println("Duration: " + duration);
        System.out.println("Car: " + car.getBrand() + " " + car.getModel());
        System.out.println("Client: " + client.getName());
        System.out.println("Manager: " + manager.getName());
        System.out.println("Insurance: " + insurance.getAmountInsured());
        System.out.println("Branch: "  + dealerBranchName);
        System.out.println("Payment: " + payment);


    }

    public Insurance getInsurance(){
        return insurance;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setDealerBranchName(String dealerBranchName) {
        this.dealerBranchName = dealerBranchName;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }


}
