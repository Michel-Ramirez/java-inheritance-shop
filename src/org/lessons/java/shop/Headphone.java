package org.lessons.java.shop;

public class Headphone extends Product {
	
	private String color;
	private boolean wireless;

	//COSTRUTTORE
	public Headphone(String name, String description, double price, int vat, String color, boolean wireless) {
		super(name, description, price, vat);
		
		this.color = color;
		setWireless(wireless);
	}

	//GETTER & SETTER
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	
	//METODO
	public String isWireless() {
		String isWireless = "";
		
		if(wireless) {
			isWireless = "Si";
		} else {
			isWireless = "No";
		}
		return isWireless;
	}
	

	@Override
	public String toString() {
		
		
		return super.toString() + "\n"
				+ "Imei: " + getColor() + "\n"
				+ "Memoria: " + isWireless();
	}
	
}
