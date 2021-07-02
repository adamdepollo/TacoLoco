package com.app.tacoLoco.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {
	@Test
	void test_GetTotal_AddsVeggieTacoValueCorrectly() {
		String total = new Order(3,0,0,0).getTotal();
		assertEquals("7.50", total);
	}
	
	@Test
	void test_GetTotal_AddsBeefAndChickenTacoValueCorrectly() {
		String total = new Order(0,2,1,0).getTotal();
		assertEquals("9.00", total);
	}
	
	@Test
	void test_GetTotal_AddsChorizoTacoValueCorrectly() {
		String total = new Order(0,0,0,3).getTotal();
		assertEquals("10.50", total);
	}
	
	@Test
	void test_GetTotal_AppliesTwentyPercentDiscount_WhenOrderIs4Tacos() {
		String total = new Order(4,0,0,0).getTotal();
		assertEquals("8.00", total);
	}
	
	@Test 
	void test_GetTotal_RoundsCorrectly() {
		String total = new Order(1,1,1,1).getTotal();
		assertEquals("9.60", total);
	}

}
