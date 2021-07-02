package com.example.latihanjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.latihanjpa.entity.Product;
import com.example.latihanjpa.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product>saveAllProducts(List<Product> products){
		return productRepository.saveAll(products);
		
	}
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public List<Product> getproductByName(String name) {
		return productRepository.findByName(name);
	}
	
	public List<Product> getProductByFirstName(String name) {
		return productRepository.findByFirstName(name);
	}
	
	public String deleteProductById(int id) {
		productRepository.deleteById(id);
		return "Product deleted";
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		return productRepository.save(existingProduct);
	}
	}
