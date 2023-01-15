package com.example.calc;

public class Calc extends CalcModel {

    public Calc() {
        
    }
    // do_it
    @Override
    public double plus() {
        return x + y;
    }

    @Override
    public double minus() {
        return x - y;
    }

    @Override
    public double divide() {
        return x / y;
    }

    @Override
    public double multiply() {
        return x * y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }

}
