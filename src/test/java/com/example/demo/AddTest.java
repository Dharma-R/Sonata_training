package com.example.demo;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.DefaultAddition;

public class AddTest {
	@Test
	void addtest1() {
		AddInterface add = new DefaultAddition();
		assertEquals(20,add.add(10,10));
		
	}
	@Test
	void addtest2() {
		AddInterface add = new DefaultAddition();
		assertEquals(10,add.add(10,10));
	
}
}
