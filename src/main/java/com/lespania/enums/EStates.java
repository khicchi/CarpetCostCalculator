package com.lespania.enums;

public enum EStates {

    state_VA("VA", new ECities[]{ECities.city_dallas, ECities.city_austin, ECities.city_sanAntonio}),
    state_TX("TX", new ECities[]{ECities.city_arlington, ECities.city_fairfax, ECities.city_mcLean});

    private String abbreviation;
    private ECities[] cities;

    EStates(String abbreviation, ECities[] cities){
        this.abbreviation = abbreviation;
        this.cities = cities;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public ECities[] getCities() {
        return cities;
    }
}
