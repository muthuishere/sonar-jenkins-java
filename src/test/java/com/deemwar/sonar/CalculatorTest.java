package com.deemwar.sonar;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.deemwar.sonar.Calculator;

public class CalculatorTest {

	
	Calculator calculator;
	
	@Before
	public void setup(){
		calculator= new Calculator();
		
	}
	
	 @Test public void testAppCanPrintName() {
	        
	        assertNotNull("Calculator", calculator.reset());
	    }
	 
}
