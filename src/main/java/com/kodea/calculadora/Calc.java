package com.kodea.calculadora;

public class Calc {

	public double add(int a, int b){
		double r=a+b;
		return r;
		
	}

	public double substract(int val1, int val2) {
		return val1-val2;
	}

	public double product(int val1, int val2) {
		return val1*val2;
	}

	public double division(int val1, int val2) {
		if(val2!=0)
			return val1/val2;
		else
			throw new ArithmeticException("Can't divide by zero");
	}
}
