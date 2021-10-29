package com.lespania.services;

import com.lespania.interfaces.ICarpetPrices;
import org.springframework.stereotype.Component;

@Component
public class CarpetVA implements ICarpetPrices {
    @Override
    public double getCarpetPrice() {
        return 0;
    }
}
