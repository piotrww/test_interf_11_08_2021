package com.company;

public class Audi implements Car {
    @Override
    public String hornSignal() {
        return "Audi is calling";
    }


    @Override
    public String reverseGear() {
        return "AUDI: Pull up, gear 2";
    }

    @Override
    public String changeTrafficLane() {
        return "AUDI: Changing lane";
    }
}
