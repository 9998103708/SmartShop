package com.smartshop.product.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartshop.product.entity.Product;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
   

    List<Product> findByproductName(String productName);


//    List<Product> findByName(String productName);


}
