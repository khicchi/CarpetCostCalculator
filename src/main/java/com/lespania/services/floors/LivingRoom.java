package com.lespania.services.floors;

import com.lespania.interfaces.IFloor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom  implements IFloor {

    @Value("${rectangleCarpetWidth}")
    double rectangleCarpetWidth;

    @Value("${rectangleCarpetLength}")
    double rectangleCarpetLength;

    @Override
    public double getArea() {
        return rectangleCarpetWidth*rectangleCarpetLength;
    }
}