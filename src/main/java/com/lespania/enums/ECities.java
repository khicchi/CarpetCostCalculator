package com.lespania.enums;

public enum ECities {

    city_dallas(40),
    city_austin(20),
    city_sanAntonio(30),
    city_arlington(33),
    city_fairfax(21),
    city_mcLean(28);

    private double unitePrice;

    ECities(double unitePrice){
        this.unitePrice = unitePrice;
    }

    public double getUnitePrice() {
        return unitePrice;
    }
}
