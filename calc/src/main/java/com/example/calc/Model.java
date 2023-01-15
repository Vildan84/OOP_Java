package com.example.calc;

public interface Model {
    double plus();
    double minus();
    double divide();
    double multiply();

    void setX(double value);

    void setY(double value);
}
