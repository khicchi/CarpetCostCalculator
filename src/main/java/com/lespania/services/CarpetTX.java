package com.lespania.services;

import com.lespania.enums.ECities;
import com.lespania.interfaces.IFloor;
import org.springframework.stereotype.Component;

@Component
public class CarpetTX extends Carpet {

    @Override
    public double getPrice(ECities city) {
        return floor.getArea()*city.getSqPrice();
    }

}
