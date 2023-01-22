package org.example.config;

import org.example.service.CheckNumber;

import java.util.HashMap;
import java.util.Scanner;

public class GetConfig {

    Scanner scan = new Scanner(System.in);
    private final HashMap<String, String> hashMap = new HashMap<>();

    public void getConfig(){
        System.out.println("Enter first name: ");
        String nameOne = scan.nextLine();
        hashMap.put("NameOne", nameOne);
        System.out.println("Enter second name: ");
        String nameTwo = scan.nextLine();
        hashMap.put("NameTwo", nameTwo);
        System.out.println("Enter number of candies: ");
        String number = scan.nextLine();

        while (!CheckNumber.ifNumber(number)){
            System.out.println("Enter number of candies: ");
            number = scan.nextLine();
        }
        hashMap.put("RemainCandies", number);

        System.out.println("Enter max number candies you can take: ");
        String maxNumber = scan.nextLine();

        while (!CheckNumber.ifNumber(maxNumber)){
            System.out.println("Enter max number candies you can take: ");
            maxNumber = scan.nextLine();
        }
        hashMap.put("MaxCandiesToTake", maxNumber);

    }

    public HashMap<String, String> getHashMap(){
        return this.hashMap;
    }
}
