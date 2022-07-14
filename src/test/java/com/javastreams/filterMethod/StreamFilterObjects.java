 package com.javastreams.filterMethod;

import java.util.ArrayList;

class Product
 {
	 
	 int id;
	 String productName;
	 double price;
	
	 public Product(int id, String productName,double price) {
		 
		 this.id=id;
		 this.productName=productName;
		 this.price=price;		 
	}
	 
 }
public class StreamFilterObjects {
	
	public static void main(String[] args) {
		
		
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "canon", 20000));
		productList.add(new Product(2, "sony", 30000));
		productList.add(new Product(3, "apple", 40000));
		productList.add(new Product(4, "sony", 50000));
		productList.add(new Product(5, "samsung", 60000));
		
		productList.stream()
		.filter(pl->pl.price>10000)
		.forEach(pr->System.out.println(pr.price));
		
		
		System.out.println();
		System.out.println("sony product...");
		productList.stream()
		.filter(pl->pl.productName.contains("sony"))
		.forEach(pr->System.out.println(pr.price));
		 
		
	}

}
