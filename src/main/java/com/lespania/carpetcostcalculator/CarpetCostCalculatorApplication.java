package com.lespania.carpetcostcalculator;

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
