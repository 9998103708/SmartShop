package com.smartshop.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartshop.product.entity.Product;
import com.smartshop.product.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController("/demo")
public class productController {
	
	@Autowired
	public ProductService productService;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return productService.addProduct(product);
	}
	@GetMapping("/getAllProduct")
	public List<Product> GetAllProducts() {
		return productService.GetAllProducts();
	}
	@GetMapping("/getbyId/{productId}")
	public Optional<Product> GetProductbyId(@PathVariable int productId) {
		// TODO Auto-generated method stub
		return productService.GetProductbyId(productId);
	}

@GetMapping("getProductName/{productName}")
public Product fetchProductByproductName(@PathVariable String productName){
	return  productService.fetchProductByproductName(productName);
}
}
	
	


