package com.easycook.api.dto;

public class ProductDto {
	private String name;
	private double quantity;
	private String unit;
	
	
	public ProductDto() {
	}


	public ProductDto(String name, double quantity, String unit) {
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}


	public String getName() {
		return name;
	}


	public double getQuantity() {
		return quantity;
	}


	public String getUnit() {
		return unit;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "ProductDto [name=" + name + ", quantity=" + quantity + ", unit=" + unit + "]";
	}
	
	
}
