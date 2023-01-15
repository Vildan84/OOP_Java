package com.example.calc;

public class ConvertValue {

    public static Double convert(String number){
        return number.matches("-?\\d+(\\.\\d+)?") ? Double.parseDouble(number) : 0;
    }
}
