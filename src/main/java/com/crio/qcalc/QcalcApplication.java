package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting Qcalc...");
		StandardCalculator calc=new StandardCalculator();
		calc.add(1,1);
		// calc.subtract(1, 1);
		// calc.multiply(25, 5);
		// calc.divide(1,1);
		calc.printResult();

	}

}
