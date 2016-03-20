/**
 * 
 */
package org.open.application.databean;

import java.util.Calendar;

/**
 * @author SandeepRaju
 *
 */
public class Product {
	
	private int id;
	private String productName;
	private double price;
	private Calendar  dateOfManufacture;
	
	public Product() {
		
	}
	
	public Product(int id, String productName, double price, Calendar  dateOfManufacture) {
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.dateOfManufacture = dateOfManufacture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Calendar getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Calendar dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

}
