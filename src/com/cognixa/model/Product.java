package com.cognixa.model;

public class Product {
	private String item;
	private String itemCode;
	private double price;

	public Product(String item, String itemCode, double price) {
		super();
		this.item = item;
		this.itemCode = itemCode;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
