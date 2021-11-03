package com.lespania.enums;

public enum EStates {

    TX("carpetTX", new ECities[]{ECities.DALLAS, ECities.AUSTIN, ECities.SANANTONIO}),
    VA("carpetVA", new ECities[]{ECities.ARLINGTON, ECities.FAIRFAX, ECities.MCLEAN});

    private String className;
    private ECities[] cities;
    EStates(String className, ECities[] cities){
        this.className = className;
        this.cities = cities;
    }

    public String getClassName(){return className;}

    public ECities[] getCities() {
        return cities;
    }
}
