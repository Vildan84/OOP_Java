package com.example.calc;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        String tempA = view.getValue("a: ");
        Double a = ConvertValue.convert(tempA);
        String sign = view.getSign();
        String tempB = view.getValue("b: ");
        Double b = ConvertValue.convert(tempB);
        model.setX(a);
        model.setY(b);
        switch (sign){
            case ("+") -> {
                double result = model.plus();
                view.print(result, "Sum: ");
            }
            case ("-") -> {
                double result = model.minus();
                view.print(result, "Remain: ");
            }
            case ("/") -> {
                double result = model.divide();
                view.print(result, "Remain: ");
            }
            case ("*") -> {
                double result = model.multiply();
                view.print(result, "Result: ");
            }
        }

    }
}
