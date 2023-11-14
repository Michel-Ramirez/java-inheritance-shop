package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Product {
	
	private int imei;
	private int memory;
	
	//COSTRUTTORE
	public Smartphone(String name, String description, double price, int vat, int memory) {
		super(name, description, price, vat);
		
		genImei();
		setMemory(memory);
		
	}
	
	//GENRENO PRIVATAMENTE L'IMEI
	private void genImei() {
		
		Random rnd = new Random();
		
		setImei(rnd.nextInt(0, Integer.MAX_VALUE));
	}
	
	
	//GETTER & SETTER
	public int getImei() {
		
		return imei;
	}
	private void setImei(int imei) {
		this.imei = imei;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}

	
	@Override
	public String toString() {
		
		
		return super.toString() + "\n"
				+ "Imei: " + getImei() + "\n"
				+ "Memoria: " + getMemory() ;
	}
	
}
