package org.lessons.java.shop;

public class Tv extends Product {
	
	private int dimension; // inteso come in pollici
	private boolean	smart;
	
	//COSTRUTTORE
	
	public Tv(String name, String description, double price, int vat, int dimension, boolean smart) {
		super(name, description, price, vat);
		
		this.dimension = dimension;
		setSmart(smart);
		
	}
	
	
	//GETTER SETTER

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean getSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	//METODO
	
	public String isSmart() {
		
		String isSmart = "";
		
		if(smart) {
			isSmart = "Si";
		} else {
			isSmart = "No";
		}
		
		return isSmart;
		
	}
	
	@Override
	public String toString() {
		
		
		return super.toString() + "\n"
				+ "Dimensioni: " + getDimension() + '"' +  "\n"
				+ "SmartTv: " + isSmart();
	}
	
	
}
