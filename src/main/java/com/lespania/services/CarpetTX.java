package com.lespania.services;

import com.lespania.interfaces.ICarpetPrices;
import org.springframework.stereotype.Component;

@Component
public class CarpetTX implements ICarpetPrices {
    @Override
    public double getCarpetPrice() {
        return 0;
    }
}
