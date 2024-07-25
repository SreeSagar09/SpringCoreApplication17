package com.app;

import org.springframework.stereotype.Component;

@Component
public class MaterialComponent {
	private String materialName = "Paper";
	private Integer quantity = 12;
	private Double price = 120.00;

	@Override
	public String toString() {
		return "MaterialComponent [materialName=" + materialName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
