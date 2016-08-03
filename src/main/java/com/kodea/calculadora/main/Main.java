package com.kodea.calculadora.main;

import java.util.Scanner;

import com.kodea.calculadora.Calc;

public class Main {
	public static void main (String[] args){

		Scanner leer =new Scanner(System.in);
		
		System.out.println("Ingrese operando [+ - * /]:");
		String operando = leer.next();
		
		System.out.println("Ingrese primer número:");
		double a=leer.nextDouble();
		
		System.out.println("Ingrese segundo número:");
		double b=leer.nextDouble();
		
		Calc op =new Calc(operando, a,b);
		
		try{
			double result = op.operando();
			System.out.println(result);
		} catch (ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		
		leer.close();
	}
}
