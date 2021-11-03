package com.lespania.services.floors;

import com.lespania.interfaces.IFloor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements IFloor {

    @Value("${squareCarpetLength}")
    double squareCarpetLength;


    @Override
    public double getArea() {
        return squareCarpetLength*squareCarpetLength;
    }
}
