package com.pett4j.orders.services;

import com.pett4j.orders.model.Item;
import com.pett4j.orders.model.Order;
import com.pett4j.orders.model.OrderState;

public class OrderService {

	private static OrderService orderService;

	private OrderService() {
	}

	public static OrderService getInstance() {
		if (orderService == null) {
			orderService = new OrderService();
		}
		return orderService;
	}

	public Order findOrderById(Long orderId) {
		// FIXME Mock
		return new Order(orderId);
	}

	public void saveOrder(Order order) {
		// FIXME Mock

	}

	public void addItem(Long orderId, Item item) {
		Order order = findOrderById(orderId);
		order.addItem(item);
	}

	public void updateState(Long orderId, OrderState orderState) {
		Order order = findOrderById(orderId);
		order.setOrderState(OrderState.CLOSED);
	}
}
