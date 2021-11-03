package com.lespania.carpetcostcalculator;

import com.lespania.enums.ECities;
import com.lespania.enums.EStates;
import com.lespania.services.Carpet;
import com.lespania.services.CarpetTX;
import com.lespania.services.CarpetVA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;


@SpringBootApplication(scanBasePackages = "com.lespania")
@ComponentScan({"com.lespania.enums", "com.lespania.services"})
public class CarpetCostCalculatorApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext container = SpringApplication.run(CarpetCostCalculatorApplication.class, args);

        Carpet carpet;
        EStates state;
        ECities city = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to carpet calculator by Kicchi");

        System.out.println("Please select your state. TX or VA");
        String stateName = scanner.nextLine();
        if (stateName.toLowerCase().equals("tx"))
            state = EStates.TX;
        else if (stateName.toLowerCase().equals("va"))
            state = EStates.VA;
        else
            throw new Exception("Choose either VA or TX please!");

        System.out.println("Please enter your city code.");
        Arrays.stream(state.getCities()).forEach(c -> System.out.print(c.getCityCode() + " " + c.name() + " "));

        int cityCodeFromScreen = scanner.nextInt();
        Optional<ECities> citiesOptional = Arrays.stream(ECities.values()).filter(c -> c.getCityCode() == cityCodeFromScreen).findFirst();
        if (citiesOptional.isPresent())
            city = citiesOptional.get();

        if (state == EStates.TX)
            carpet = container.getBean(state.getClassName(), CarpetTX.class);
        else
            carpet = container.getBean(state.getClassName(), CarpetVA.class);


        System.out.println(carpet.getPrice(city));
    }



}
