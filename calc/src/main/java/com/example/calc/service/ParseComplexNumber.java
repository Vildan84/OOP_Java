package com.example.calc.service;

public class ParseComplexNumber {

    private Double x, y;
    Integer signIndex;
    String stringX;
    String stringY;

    public void parse(String number) {

        for(int i = 0; i < number.length(); i++) {
            if (String.valueOf(number.charAt(i)).equals("+") || String.valueOf(number.charAt(i)).equals("-") && i > 0) {
                signIndex = i;
            }
        }

        if(signIndex == null || signIndex == number.length() - 1){
            stringX = "1";
            stringY = "1";
        }
        else{
            stringX = number.substring(0, signIndex);
            stringY = number.substring(signIndex, number.length() - 1);

            if(String.valueOf(number.charAt(signIndex)).equals("+")){
                stringY = number.substring(signIndex + 1, number.length() - 1);
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
