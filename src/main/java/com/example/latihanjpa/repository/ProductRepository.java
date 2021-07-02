package com.example.latihanjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.latihanjpa.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public List<Product> findByName(String name);
	
	@Query(value = "select id, name, quantity, price from product where name LIKE %?1%", nativeQuery =  true)
	public List<Product> findByFirstName(String name);

}
