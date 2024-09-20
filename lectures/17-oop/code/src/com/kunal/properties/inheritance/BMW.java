package com.kunal.properties.inheritance;

public class BMW extends Car{
     String engine = "3l";
    String safety = "ADAS features";
    String model = "M340i";

    void rev(){
        System.out.println("BMW car is revving");
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        Car car = new Car();
        Car superCar = new BMW();

        System.out.println("bmw engine "+bmw.engine);
        bmw.rev();
        car.rev();
        superCar.rev();
        System.out.println("car engine "+car.engine);
        System.out.println("super car engine "+superCar.engine);
//        System.out.println("car engine"+car.engine);
    }
}
