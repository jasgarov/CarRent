package com.company;

public class Car implements newCar {
    private int numOfPassengers;
    private double marketValue;
    private String registrationNum;
    private ClassOfCar carClass;
    private String model;
    private String Brand;

    Car(){}

    /**
     *
     * constructor initialising all the fields
     *
     * @param numOfPassengers
     * @param marketValue
     * @param registrationNum
     */
    Car(int numOfPassengers, double marketValue, String registrationNum, String model, String brand) {
        setNumberOfSeats(numOfPassengers);
        setMarketValue(marketValue);
        setRegistrationNum(registrationNum);
        setCarClass();
        setModel(model);
        setBrand(brand);
    }

    /**
     * Brand field setter
     * @param brand
     */
    public void setBrand(String brand) {
        Brand = brand;
    }

    /**
     * model field setter
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * numOfPassengers field getter
     * @return
     */
    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    /**
     * marketValue getter
     * @return
     */
    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    @Override
    public void setNumberOfSeats(int numberOfSeats) {
        this.numOfPassengers = numberOfSeats;
    }

    @Override
    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    @Override
    public void setCarClass() {
        if(marketValue<15000) {
            carClass = carClass.ECONOMY;
        } else if (marketValue<30000) {
            carClass = carClass.STANDARD;
        } else if(marketValue<50000) {
            carClass = carClass.PREMIUM;
        } else {
            carClass = carClass.LUXURY;
        }
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return Brand;
    }
}
