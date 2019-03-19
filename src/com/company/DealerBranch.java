package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class DealerBranch {
    private String address;
    private String phoneNum;
    private String name; //Branch Name

    private Manager topManager;
    private ArrayList <Car> fleet;
    private CreateContract createContract;


    //write a method that checks with contract are past due

    DealerBranch(){}

    DealerBranch(String address, String phoneNum, Manager topManager){
        this.address = address;
        this.phoneNum = phoneNum;
        this.topManager = topManager;
        createContract = new CreateContract(this);
    }

    public ArrayList<RentContract> checkIfCarIsOverdue(ArrayList<RentContract> contracts) {
        ArrayList<RentContract> list = new ArrayList<RentContract>();
        for (RentContract contract: contracts) {
            if (Period.between(LocalDate.parse(contract.getDate()), LocalDate.now()).getDays() > contract.getDuration()
                    && !contract.isCarReturned) {
                contract.setCurrentFine(countFine(contract));
                    list.add(contract);
            }
        }
        return list;
    }

    private int countFine(RentContract contract) {
        int fine = (Period.between(LocalDate.parse(contract.getDate()), LocalDate.now()).getDays() - contract.getDuration()) * 10;
        return fine;
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
        CreateContract.getUniqueInstance().contracts.add(createContract.newContract(duration, car, client));
    }
}
