package com.lespania.enums;

import org.springframework.stereotype.Component;

public enum ECities {

//    DALLAS,
//    AUSTIN,
//    SANANTONIO,
//    ARLINGTON,
//    FAIRFAX,
//    MCLEAN;

    DALLAS(1.5d, 101),
    AUSTIN(1.7d, 102),
    SANANTONIO(1.8d, 103),
    ARLINGTON(1.9d, 104),
    FAIRFAX(1.2d, 105),
    MCLEAN(2.2d, 106);

    private double sqPrice;
    private int cityCode;
    ECities(double sqPrice, int cityCode){
        this.sqPrice = sqPrice; this.cityCode = cityCode;
    }

    public double getSqPrice(){return sqPrice;}

    public int getCityCode(){return cityCode;}

}
