package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String pdType;
		String name;
		String description;
		String price;
		int vat;
		int memory;
		int dimension;
		String color;
		boolean tvType = false;
		boolean hpType = false;
		
		int maxLng = 5;
		
		//Inizializzo la lista di oggetti
		ArrayList<Product> prodList = new ArrayList<>(maxLng);
		
		
		//ciclo per la massima lunghezza della lista
		for (int x=0; x<maxLng; x++) {
			
			//Interrogo l'utente che prodotto sta inserendo
			System.out.print("Quale prodotto stai inserendo? smtp(smartphone), tv o cuf(cuffie): ");
			pdType = in.nextLine();
		
			//In base al input dell'utente applico la logica corretto per l'inserimento del prodotto
			
			if(pdType.equals("smtp")) {
				
				System.out.print("Nome prodotto: ");
				name = in.nextLine();
				
				System.out.print("Descrizione prodotto: ");
				description = in.nextLine();
				
				System.out.print("Prezzo: ");
				price = in.nextLine(); //Attenzione è una stringa
				float priceFloat = Float.parseFloat(price);
				
				System.out.print("Iva da applicare: ");
				String strVat = in.nextLine();
				vat = Integer.valueOf(strVat);
				
				System.out.print("Memoria: ");
				String strMemory = in.nextLine();
				memory = Integer.valueOf(strMemory);
				
				
				Smartphone ph = new Smartphone(name, description, priceFloat , vat, memory);
		
				prodList.add(ph);
				
					
			}
			
			if(pdType.equals("tv")) {
				
				System.out.print("Nome prodotto: ");
				name = in.nextLine();
				
				System.out.print("Descrizione prodotto: ");
				description = in.nextLine();
				
				System.out.print("Prezzo: ");
				price = in.nextLine(); //Attenzione è una stringa
				float priceFloat = Float.parseFloat(price);
				
				System.out.print("La Tv è smart? si o no: ");
				String type = in.nextLine();
				
				if(type.equals("si")) {
					tvType = true;
				}
				
				System.out.print("Iva da applicare: ");
				String strVat = in.nextLine();
				vat = Integer.valueOf(strVat);
				
				System.out.print("Dimenzioni in pollice: ");
				String strDim = in.nextLine();
				dimension = Integer.valueOf(strDim);
				
				
				System.out.println();
				
				Tv tv = new Tv(name, description, priceFloat, vat, dimension, tvType);
		
				prodList.add(tv);
				
			
					
			}
			
			if(pdType.equals("tv")) {
				
				System.out.print("Nome prodotto: ");
				name = in.nextLine();
				
				System.out.print("Descrizione prodotto: ");
				description = in.nextLine();
				
				System.out.print("Prezzo: ");
				price = in.nextLine(); //Attenzione è una stringa
				float priceFloat = Float.parseFloat(price);
				
				System.out.print("Iva da applicare: ");
				String strVat = in.nextLine();
				vat = Integer.valueOf(strVat);
				
				System.out.print("Colore: ");
				color = in.nextLine();
				
				System.out.print("Le cuffie sono Wireless? si o no: ");
				String type = in.nextLine();
				
				if(type.equals("si")) hpType = true;
				
				Headphone headp = new Headphone(name, description, priceFloat, vat, color, hpType);
		
				prodList.add(headp);
				
					
			}
						
			
		}
		
		System.out.println(prodList);
		
	}

}
