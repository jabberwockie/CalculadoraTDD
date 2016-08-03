package com.kodea.calculadora;

public class Calc implements ICalc{
	
	private String op;
	private double a;
	private double b;
	
	public Calc(){}
	
	public Calc (String op, double a, double b){
		this.a=a;
		this.b=b;
		this.op=op;
	}

	public double add(double a, double b){
		double r=a+b;
		return r;
		
	}

	public double substract(double val1, double val2) {
		return val1-val2;
	}

	public double product(double val1, double val2) {
		return val1*val2;
	}

	public double division(double val1, double val2) {
		if(val2!=0)
			return val1/val2;
		else
			throw new ArithmeticException("Can't divide by zero");
	}
	
	public double operando() throws ArithmeticException{
		double r=0;
		if(op.contains("+"))
			r=add(a,b);
		if(op.contains("-"))
			r=substract(a,b);
		if(op.contains("*"))
			r=product(a,b);
		if(op.contains("/"))
			r=division(a,b);
		return r;
	}
}
