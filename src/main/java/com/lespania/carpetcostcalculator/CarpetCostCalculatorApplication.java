package com.lespania.carpetcostcalculator;

import com.lespania.enums.EStates;
import com.lespania.services.CarpetTX;
import com.lespania.services.CarpetVA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication(scanBasePackages = "com.lespania")
public class CarpetCostCalculatorApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(CarpetCostCalculatorApplication.class, args);

         container.getBean("carpetTX", CarpetTX.class);
         container.getBean("carpetVA", CarpetVA.class);

    }

    private static void carpetCostProcess(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("From which state do you want to buy a carpet? TX or VA");
        String stateInput = scanner.nextLine();

        System.out.println("From which city do you want to buy a carpet?");
        String cityInput = scanner.nextLine();

        System.out.println("Is it a kitchen or bedroom or living room?");
        String floorInput = scanner.nextLine();


    }

    private static void checkState(String stateInput){
        //if user input is in the states enum
        if (Arrays.stream(EStates.values()).map(EStates::getAbbreviation).collect(Collectors.toList()).contains(stateInput)){

        }
    }

}
