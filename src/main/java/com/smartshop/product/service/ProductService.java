package com.smartshop.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.smartshop.product.entity.Product;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface ProductService {
	public Product addProduct(Product product);
	public Product UpdatePrdoductbyName(String productName);
	public List<Product> saveProducts(List<Product> products);

	public List<Product> GetAllProducts();
	

	Optional<Product> GetProductbyId(int productId);

	public Product DeletProductbyName(String productName);

	Product getByName(String productName);
	public Product fetchProductByproductName(String productName);

}
