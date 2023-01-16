package com.example.calc.service;

public class ConvertValue {

    public static Double convert(String number){
        return number.matches("-?\\d+(\\.\\d+)?") ? Double.parseDouble(number) : 0;
    }
}
