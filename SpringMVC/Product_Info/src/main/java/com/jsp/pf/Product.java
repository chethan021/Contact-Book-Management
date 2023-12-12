package com.jsp.pf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productis;
public int getProductis() {
		return productis;
	}
	public void setProductis(int productis) {
		this.productis = productis;
	}
private String Product_Id;
private String Product_Name;
private String Product_Price;
public String getProduct_Id() {
	return Product_Id;
}
public void setProduct_Id(String product_Id) {
	Product_Id = product_Id;
}
public String getProduct_Name() {
	return Product_Name;
}
public void setProduct_Name(String product_Name) {
	Product_Name = product_Name;
}
public String getProduct_Price() {
	return Product_Price;
}
public void setProduct_Price(String product_Price) {
	Product_Price = product_Price;
}
}