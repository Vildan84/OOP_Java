package com.example.calc;

import com.example.calc.presenter.Presenter;
import com.example.calc.view.View;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class CalcApplication {


	public static void main(String[] args) {

		boolean stop = true;
		Scanner scan = new Scanner(System.in);

		while(stop){
			System.out.println("//////////////////////////////////");
			System.out.println("""
					Enter: 1 for real Calculator
					Enter: 2 for complex Calculator (format: 5+5i)
					Enter: 3 to quit""");
			System.out.println("//////////////////////////////////");
			System.out.println("Enter: ");
			String number = scan.next();
			switch (number){
				case("1") -> {
					Presenter presenter = new Presenter(new View());
					presenter.buttonClick();
				}
				case ("2") -> {
					Presenter presenter = new Presenter(new View());
					presenter.buttonClickComplex();
				}
				case ("3") -> stop = false;

				default -> log.info("Wrong number input " + number);
			}

		}

	}

}
