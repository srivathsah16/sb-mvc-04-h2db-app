package com.srivath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.srivath.binding.dto.ProductDto;
import com.srivath.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	//Controller methods annotated with @ModelAttribute will be executed first.
	//The below method adds the return type to a named attribute "p". This attribute will be available to all the view pages in the project.
	@ModelAttribute("p")
	public ProductDto getProductDto() {
		return new ProductDto();
	}

	@GetMapping("/")
	public String home(Model model) {
		return "index";
	}
	
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute("p") ProductDto dto, Model model) {
		if (service.saveProduct(dto)) {
			model.addAttribute("message", "Saved in database.");
		}
		return "index"; 
	}

	@GetMapping("/products")
	public String getAllProducts(Model model) {
		model.addAttribute("products", service.getAllProducts());
		return "displayProducts";
	}

}
