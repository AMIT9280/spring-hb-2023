package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.entity.ProductEntity;
import com.repositrory.ProductRepository;
 
@Controller
public class ProductController {

	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/addProduct") 
	public String AddProduct() {   
	
		return "AddProduct";  
	} 
	@PostMapping("/saveProduct")
	public String saveProduct(ProductEntity product) {
		productRepo.save(product);
		return "AddProduct";   
	} 
	@GetMapping("/products") 
	public String GetAllProducts(Model model) {
		List<ProductEntity> products = productRepo.findAll();
		model.addAttribute("products", products);
		return "ListProducts";
	}
	@GetMapping("/deleteProduct/{productId}")  
	public String DeleteProduct(@PathVariable("productId") Integer productId) {
		productRepo.deleteById(productId);
		return "redirect:/products";
	}
	 
	@GetMapping("/UpdateProduct/{productId}")
	public String UpdateProduct(@PathVariable("productId")  Integer productId,Model model) {
		Optional<ProductEntity> p = productRepo.findById(productId);
		ProductEntity pe = null;
		if(p.isPresent()) {
			pe = p.get();
		} 
//		System.out.println(pe);
		model.addAttribute("product",pe);
//		System.out.println(pe.getProductName());
		return "UpdateProduct"; 
	}
	  
	@PostMapping("/EditProduct") 
	public String updateProduct(ProductEntity product) {
		 
		productRepo.save(product);  
		return "redirect:/products"; 
	} 
	
	
	
}
