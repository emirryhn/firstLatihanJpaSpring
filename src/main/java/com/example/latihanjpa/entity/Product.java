package com.example.latihanjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "product")
public class Product {
	
	@Id
	@GeneratedValue
	
	private int id;
	private String name;
	private int quantity;
	private Double price;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public Double getPrice() {
//		return price;
//	}
//	public void setPrice(Double price) {
//		this.price = price;
//	}
	
	
}
