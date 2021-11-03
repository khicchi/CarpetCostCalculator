package com.lespania.carpetcostcalculator;

import com.lespania.interfaces.ICarpetPrices;
import com.lespania.services.carpet.CarpetTX;
import com.lespania.services.carpet.CarpetVA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication(scanBasePackages = "com.lespania")
@ComponentScan({"com.lespania.enums", "com.lespania.services"})
public class CarpetCostCalculatorApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(CarpetCostCalculatorApplication.class, args);


    }


}
