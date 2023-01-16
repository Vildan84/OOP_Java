package com.example.calc.view;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class View{
    Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }

    public String getSign(){
        return in.nextLine();
    }

    public void print(Object data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
