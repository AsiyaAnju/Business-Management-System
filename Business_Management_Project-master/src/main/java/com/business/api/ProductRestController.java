package com.business.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.business.entities.Product;

import java.util.List;

import com.business.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductRestController 
{
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public Iterable<Product> getAllProducts() {
	    return productRepository.findAll();
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		return productRepository.save(product);
	}
}
