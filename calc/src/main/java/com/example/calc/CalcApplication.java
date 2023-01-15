package com.example.calc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {

		Presenter plus = new Presenter(new Calc(), new View());
		plus.buttonClick();


	}

}
