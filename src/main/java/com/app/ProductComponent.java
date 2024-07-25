package com.app;

import org.springframework.stereotype.Component;

@Component(value = "PRODUCTCOMPONENT")
public class ProductComponent {
	private String productName = "Bicycle";
	private Integer quantity = 10;
	private Double price = 120.00;
	
	@Override
	public String toString() {
		return "ProductComponent [productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
