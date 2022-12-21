package com.smartshop.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pproductId, String productName, double productPrice, int pproductQuantity) {
		super();
		this.productId = pproductId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	public int getproductId() {
		return productId;
	}
	public void setpproductId(int productId) {
		this.productId = productId;
	}
	public void getproductName(String productName) {
		this.productName=productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public double getproductPrice() {
		return productPrice;
	}
	public void setproductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getproductQuantity() {
		return productQuantity;
	}
	public void setproductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	

}
