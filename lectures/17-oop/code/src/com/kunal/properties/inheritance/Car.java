package com.kunal.properties.inheritance;

public class Car {

    static String type = "sedan";
    protected String insurance = "Car insurance";
    String engine = "2l";
    String safety = "standard safety features";
    String fuelType = "Hybrid";

     Car(){

    }

    void rev(){
        System.out.println("car is revving");
    }
}
