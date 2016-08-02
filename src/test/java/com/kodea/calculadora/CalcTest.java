package com.kodea.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalcTest {

	@Test
	public void checkInstance(){
	
		//arrange
		Calc calc;
		
		//act
		calc = new Calc();
		
		//assert
		assertNotNull(calc);
	}

	@Test
	public void checkAddTwoIntegers(){
	
		//arrange
		Calc calc;
		calc= new Calc();
		int val1=1;
		int val2=2;
		
		//act
		double result = calc.add(val1, val2);
		
		//assert
		assertEquals(3, result, 0.1);
	}
	
	@Test
	public void checkSubstractTwoIntegers(){
		
		//arrange 
		Calc calc = new Calc();
		int val1= 50;
		int val2=12;
		
		//act
		double result=calc.substract(val1, val2);
		
		//assert
		assertEquals(38, result, 0.1);
	}
	
	@Test
	public void checkProductTwoIntegers(){
		
		//arrange
		Calc calc= new Calc();
		int val1=10;
		int val2=5;
		
		//act
		double result=calc.product(val1, val2);
		
		//assert
		assertEquals(50, result, 0.1);
	}
	
	@Test(expected=ArithmeticException.class)
	public void checkDivisionTwoIntegers(){
		
		//arrange
		Calc calc = new Calc();
		int val1=50;
		int val2=0;
		
		calc.division(val1, val2);
	}
	
}

