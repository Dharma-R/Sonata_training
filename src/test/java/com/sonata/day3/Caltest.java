package com.sonata.day3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.sonata.day3.Calculator;

public class Caltest {
		
		Calculator c1 = new Calculator();
	
		
		
		@Test
		public void div1Test() {
			assertThrows(ArithmeticException.class,()->c1.div1(1,0),"it is an error");
		}

		
	}


