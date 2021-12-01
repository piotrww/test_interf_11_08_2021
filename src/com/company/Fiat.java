package com.company;

public class Fiat implements Car {
    @Override
    public String hornSignal() {

        return "Fiat is calling";
    }

    @Override
    public String reverseGear() {

        return "FIAT: Pull up, gear 2";
    }

    @Override
    public String changeTrafficLane() {

        return "FIAT: Changing Lane";
    }
}
