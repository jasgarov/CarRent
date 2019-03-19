package com.company;

import java.util.ArrayList;

public class DealerBranch {
    private String address;
    private String phoneNum;
    private String name; //Branch Name

    private Manager topManager;
    private ArrayList <Car> fleet;
    private ArrayList <RentContract> contracts;
    private CreateContract createContract;

    //write a method that checks with contract are past due

    DealerBranch(){}

    DealerBranch(String address, String phoneNum, Manager topManager){
        this.address = address;
        this.phoneNum = phoneNum;
        this.topManager = topManager;
        createContract = new CreateContract(this);
    }

    public void setTopManager(Manager topManager) {
        this.topManager = topManager;
    }

    public Manager getTopManager() {
        return topManager;
    }

    public String getName() {
        return name;
    }

    public void createContract(int duration, Car car, Client client) {
        contracts.add(createContract.newContract(duration, car, client));
    }
}
