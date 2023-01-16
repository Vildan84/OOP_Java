package com.example.calc.model;

public class CalcComplex implements Model {

    public Double a, b, c, d;

    public CalcComplex(Double a, Double b, Double c, Double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public Object plus() {
        Double real = a + c;
        Double image = b + d;
        if(image < 0){
            return String.format("%s%si", real, image);
        }
        return String.format("%s+%si", real, image);
    }

    @Override
    public Object minus() {
        Double real = a - c;
        Double image = b - d;
        if(image < 0){
            return String.format("%s%si", real, image);
        }
        return String.format("%s+%si", real, image);
    }

    @Override
    public Object divide() {
        Double real = (a*c + b*d)/(c*c + d*d);
        Double image = (b*c - a*d)/(c*c + d*d);
        if(image < 0){
            return String.format("%s%si", real, image);
        }
        return String.format("%s+%si", real, image);
    }

    @Override
    public Object multiply() {
        Double real = a*c - b*d;
        Double image = b*c + a*d;
        if(image < 0){
            return String.format("%s%si", real, image);
        }
        return String.format("%s+%si", real, image);
    }

}
