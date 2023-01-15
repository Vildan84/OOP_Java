package com.example.calc;

import java.util.Scanner;

public class View{
    Scanner in = new Scanner(System.in);
    String value;

    public String getValue(String title) {
        System.out.printf("%s", title);
        value = in.next();
        return value;
    }

    public String getSign(){
        return in.next();
    }

    public void print(double data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
