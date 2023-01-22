package org.example.service;

public class CheckNumber {

    public static Boolean ifNumber(String str){
        return str.matches("\\d+");
    }
}
