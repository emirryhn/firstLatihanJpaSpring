package com.example.latihanjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.latihanjpa.entity.Product;
import com.example.latihanjpa.service.ProductService;

@RestController//RESTCONTROLLER MEMBERI TAU BAWHA INI KELAS CONTROLLER
public class ProductController {
	
	@Autowired//AUTOWIRED DIGUNAKAN UNTUK MEMBERI TAHU BAHWA ADA CLASS YANG MEBERIKAN METHOD2
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {//REQUESTBODY UNTUK INSERT DATA
		return productService.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addAllProducts(@RequestBody List<Product> products){
		return productService.saveAllProducts(products);
		
	}
	/**
	 * --------------------------------------------------------------------------
	 * METHOD ADDPRODUCT & ADDPRODUCTS PADA DASARNYA SAMA SAJA
	 * ADDPRODUCTS LEBIH EFEKTIF DIKARENAKAN BISA INPUT LEBIH DARI 1 DATA
	 * --------------------------------------------------------------------------
	 */
	
	@GetMapping("/getAllProducts")
	public List<Product> findAllProduct(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id){
		//PATHVARIABLE DIPAKE KETIKA ADA VARIABLE YANG UNIK, CONTOH id
		return productService.getProductById(id);
	}
	
	@GetMapping("/getProductByName/{name}")
	public List<Product> getProductByName(@PathVariable String name){
		//PATHVARIABLE DIPAKE KETIKA ADA VARIABLE YANG UNIK, CONTOH name
		return productService.getproductByName(name);
	}
	
	@GetMapping("/byFirstName/{name}")
	public List<Product> getProductByFirstName(@PathVariable String name){
		//PATHVARIABLE DIPAKE KETIKA ADA VARIABLE YANG UNIK, CONTOH name
		return productService.getProductByFirstName(name);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable int id) {
		return productService.deleteProductById(id);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	

}
