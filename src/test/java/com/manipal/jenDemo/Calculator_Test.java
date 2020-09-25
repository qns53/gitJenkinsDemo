package com.manipal.jenDemo;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculator_Test {
	Calculator calc;
	
	@Before
	public void before() {
		System.out.println("Before...");
		calc=new Calculator();
	}
	
	@Test
	public void testSum(){
		assertEquals(10,calc.sum(7, 2));
	}
	
	@Test
	public void testSub(){
		assertEquals(10,calc.sub(12, 2));
	}
	
	@After
	public void after() {
		System.out.println("After...");
	}
		
}
