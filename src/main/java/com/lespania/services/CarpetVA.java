package com.lespania.services;

import com.lespania.enums.ECities;
import org.springframework.stereotype.Component;

@Component
public class CarpetVA  extends Carpet {

    @Override
    public double getPrice(ECities city) {
        return floor.getArea()*city.getSqPrice();
    }

}