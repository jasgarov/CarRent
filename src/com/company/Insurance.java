package com.company;

public class Insurance {
    private int insuranceCost;
    private String insuranceID;
    private String expiryDate;
    private int amountInsured;
    private boolean isCasco;
    private Client owner;

    Insurance(Client client, Car car, int duration){
        insuranceCost = calculateInsuranceCost(client, car, duration);
    }

    private int calculateInsuranceCost(Client client, Car car, int duration) {
        insuranceCost = (int) ((car.getMarketValue()/365)/10)*duration;
        if(client.getAge()>25)
            return insuranceCost;

        return  (int) (insuranceCost * 1.2);

    }

    public int getAmountInsured() {
        return amountInsured;
    }

    public int getInsuranceCost() {
        return insuranceCost;
    }
}
