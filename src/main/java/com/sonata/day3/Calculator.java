package com.sonata.day3;

import com.sonata.day3.Calculator;

public class Calculator {
	public int add(int a , int b) {
		return a + b;
		
		
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div1(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(10,20));
		System.out.println(c1.div1(10,20));
		System.out.println(c1.mul(10,20));

	}

	}



