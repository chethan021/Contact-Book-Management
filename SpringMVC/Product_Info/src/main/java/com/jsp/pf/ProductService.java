package com.jsp.pf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
    private ProductDao productdao; 
	@Autowired
	private Product product;
    public void processProduct(String productId, String productName, String productPrice) {
        product.setProduct_Id(productId);
        product.setProduct_Name(productName);
        product.setProduct_Price(productPrice);
        productdao.saveProduct(product);
    }
}