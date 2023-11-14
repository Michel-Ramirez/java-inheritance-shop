package org.lessons.java.shop;

public class Tv extends Product {
	
	private int dimension; // inteso come in pollici
	private boolean	smart;
	
	public Tv(String name, String description, double price, int vat, int dimension, boolean smart) {
		super(name, description, price, vat);
		
		this.dimension = dimension;
		this.isSmart();
		
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	
	
	
}
