package com.example.calc.presenter;


import com.example.calc.model.Calc;
import com.example.calc.model.CalcComplex;
import com.example.calc.service.ParseComplexNumber;
import com.example.calc.service.ConvertValue;
import com.example.calc.view.View;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Presenter {
    View view;

    public Presenter(View v) {
        view = v;
    }

    public void buttonClick(){
        String tempA = view.getValue("a: ");
        log.info("Entered value: "+ tempA);
        Double a = ConvertValue.convert(tempA);
        String sign = view.getSign();
        log.info("Entered sign: "+ sign);
        String tempB = view.getValue("b: ");
        log.info("Entered value: "+ tempB);
        Double b = ConvertValue.convert(tempB);
        Calc calc = new Calc(a, b);
        switch (sign){
            case ("+") -> {
                Object result = calc.plus();
                view.print(result, "Result: ");
            }
            case ("-") -> {
                Object result = calc.minus();
                view.print(result, "Result: ");
            }
            case ("/") -> {
                Object result = calc.divide();
                view.print(result, "Result: ");
            }
            case ("*") -> {
                Object result = calc.multiply();
                view.print(result, "Result: ");
            }
            default -> log.info("Wrong sign input " + sign);
        }

    }

    public void buttonClickComplex(){
        ParseComplexNumber parse = new ParseComplexNumber();
        String tempA = view.getValue("a: ");
        log.info("Entered value: "+ tempA);
        String sign = view.getSign();
        log.info("Entered sign: "+ sign);
        String tempB = view.getValue("b: ");
        log.info("Entered value: "+ tempB);
        parse.parse(tempA);
        Double a = parse.getX();
        Double b = parse.getY();
        parse.parse(tempB);
        Double c = parse.getX();
        Double d = parse.getY();
        CalcComplex calcComplex = new CalcComplex(a, b, c, d);
        switch (sign){
            case ("+") -> {
                Object result = calcComplex.plus();
                view.print(result, "Result: ");
            }
            case ("-") -> {
                Object result = calcComplex.minus();
                view.print(result, "Result: ");
            }
            case ("/") -> {
                Object result = calcComplex.divide();
                view.print(result, "Result: ");
            }
            case ("*") -> {
                Object result = calcComplex.multiply();
                view.print(result, "Result: ");
            }
            default -> log.info("Wrong sign input " + sign);
        }
    }
}
