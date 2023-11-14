package org.lessons.java.shop;

public class Cart {

	public static void main(String[] args) {
		
		
		Smartphone smt1 = new Smartphone("iphone", "Iphone 15", 999, 22, 128);
		
		System.out.println(smt1 + "\n------------------------------\n");

		Tv tv1 = new Tv("Samsung", "Samsung E45D6975", 1999, 22, 49, true);
		
		System.out.println(tv1 + "\n------------------------------\n");
		
		Headphone hp1 = new Headphone("Sony", "cuffie sony wireless", 29.90, 22, "Nere", true);

		System.out.println(hp1);
	}

}
