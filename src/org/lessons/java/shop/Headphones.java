package org.lessons.java.shop;

public class Headphones extends Product {
	
	private String color;
	private boolean wireless;

	public Headphones(String name, String description, double price, int vat, String color, String wireless) {
		super(name, description, price, vat);
		
		this.color = color;
		this.isWireless();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	
	
}
