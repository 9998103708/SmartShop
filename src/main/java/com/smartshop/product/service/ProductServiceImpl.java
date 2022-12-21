package com.smartshop.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartshop.product.entity.Product;
import com.smartshop.product.repository.ProductRepo;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepo proRepo;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return proRepo.save(product);
	}

	@Override
	public Product UpdatePrdoductbyName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> GetAllProducts() {
		// TODO Auto-generated method stub
		return proRepo.findAll();
	}



	@Override
	public Optional<Product> GetProductbyId(@PathVariable int productId) {
		// TODO Auto-generated method stub
		return proRepo.findById(productId);
	}

	@Override
	public Product DeletProductbyName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getByName(String productName) {
		return null;
	}

	@Override
	public Product fetchProductByproductName(String productName) {
		return (Product) proRepo.findByproductName(productName);
	}


}





