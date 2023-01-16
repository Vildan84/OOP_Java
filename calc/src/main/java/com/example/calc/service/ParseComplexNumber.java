package com.example.calc.service;

import com.example.calc.service.ConvertValue;

public class ParseComplexNumber {

    private Double x, y;
    Integer signIndex;
    String stringX;
    String stringY;
    String num;

    public void parse(String number) {

        num = number.replace(" ", "");

        for(int i = 0; i < num.length(); i++) {
            if (String.valueOf(num.charAt(i)).equals("+") || String.valueOf(num.charAt(i)).equals("-") && i > 0) {
                signIndex = i;
            }
        }

        if(signIndex == null || signIndex == num.length() - 1){
            stringX = "1";
            stringY = "1";
        }
        else{
            stringX = num.substring(0, signIndex);
            stringY = num.substring(signIndex, num.length() - 1);

            if(String.valueOf(num.charAt(signIndex)).equals("+")){
                stringY = num.substring(signIndex + 1, num.length() - 1);
            }
        }

        this.x = ConvertValue.convert(stringX);
        this.y = ConvertValue.convert(stringY);

    }
    public Double getX(){
        return this.x;
    }
    public Double getY(){
        return this.y;
    }
}
