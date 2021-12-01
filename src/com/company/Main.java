package com.company;


public class Main {

    public static void main(String[] args) {
        Audi myAudi = new Audi();
        System.out.println(myAudi.changeTrafficLane());

        Car myAudi2 = new Audi(); //właściwe odwałanie do interface
        System.out.println(myAudi2.changeTrafficLane());

    }
}




