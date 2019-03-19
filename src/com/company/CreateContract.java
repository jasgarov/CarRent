package com.company;

import java.util.ArrayList;
import java.util.Date;

public class CreateContract {
    private RentContract rentContract;
    private DealerBranch dealerBranch;
    public static ArrayList<RentContract> contracts;

    CreateContract(DealerBranch dealerBranch) {
        this.dealerBranch = dealerBranch;
    }

    private volatile static CreateContract uniqueInstance;


    private CreateContract() {
        uniqueInstance = new CreateContract();
    }

    public static CreateContract getUniqueInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new CreateContract();

        return uniqueInstance;
    }

    public RentContract newContract(int duration, Car car, Client client){
//      Car, Client, Manager, Insurance, DealerBranch, Payment
        rentContract = new RentContract();

        rentContract.setDate(new Date().toString());
        rentContract.setDuration(duration);
        rentContract.setCar(car);
        rentContract.setClient(client);
        rentContract.setManager(dealerBranch.getTopManager());
        rentContract.setInsurance(new Insurance(client, car, duration));
        rentContract.setDealerBranchName(dealerBranch.getName());
        rentContract.setPayment(calculatePayment(car, duration, rentContract.getInsurance().getInsuranceCost()));

        return rentContract;
    }

    private double calculatePayment(Car car, int duration, int insuranceCost) {
        double payment=0;

        //TODO - finish logic

        return payment;
    }


}
