package com.pett4j.orders.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Long orderId;
	private List<Item> items = new ArrayList<Item>();
	private OrderState orderState;

	public Order(Long orderId) {
		this.orderId = orderId;
		this.orderState = OrderState.CREATED;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public Long getUserId() {
		return orderId;
	}

	public void setUserId(Long userId) {
		this.orderId = userId;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		items.add(item);
	}

}
