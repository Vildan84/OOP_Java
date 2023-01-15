package com.example.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {

		Presenter p = new Presenter(new SumModel(), new View());
//		PresenterOfT<Integer> presenterOfT = new PresenterOfT<Integer>(new SumModel(), new View());
		p.buttonClick();

	}

}
