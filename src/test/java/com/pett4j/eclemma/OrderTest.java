package com.pett4j.eclemma;

import org.junit.Before;
import org.junit.Test;

import com.pett4j.orders.model.Item;
import com.pett4j.orders.services.OrderService;

public class OrderTest {

	private static final long ORDER_ID = 100l;
	OrderService orderService;

	@Before
	public void fillDependence() {
		orderService = OrderService.getInstance();
	}

	@Test
	public void test() {
		orderService.addItem(ORDER_ID, new Item());
	}

}
