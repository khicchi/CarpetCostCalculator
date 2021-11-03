package com.lespania.services;

import com.lespania.enums.ECities;
import com.lespania.interfaces.ICarpetFunctionality;
import com.lespania.interfaces.IFloor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public abstract class Carpet implements ICarpetFunctionality {

    @Qualifier("livingRoom")
    @Autowired
    protected IFloor floor;


}
