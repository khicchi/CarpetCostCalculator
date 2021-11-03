package com.lespania.services.floors;

import com.lespania.interfaces.IFloor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements IFloor {

    @Value("${radiusForCircleCarpets}")
    double radiusForCircleCarpets;


    @Override
    public double getArea() {
        return Math.PI*radiusForCircleCarpets*radiusForCircleCarpets;
    }
}