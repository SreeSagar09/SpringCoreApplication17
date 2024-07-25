package com.app1;

import org.springframework.stereotype.Component;

@Component
public class ItemComponent {
	private String itemName = "Book";
	private Integer quantity = 15;
	private Double price = 25.00;
	
	@Override
	public String toString() {
		return "ItemComponent [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
