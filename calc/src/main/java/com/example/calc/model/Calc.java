package com.example.calc.model;

import com.example.calc.model.Model;

public class Calc implements Model {

    private Double x, y;

    public Calc(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Object plus() {
        return x + y;
    }

    @Override
    public Object minus() {
        return x - y;
    }

    @Override
    public Object divide() {
        return x / y;
    }

    @Override
    public Object multiply() {
        return x * y;
    }


}
