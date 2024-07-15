package com.srivath.binding.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ProductDto {
	private Integer pid;
	private String pname;
	private Double price;
	private Integer quantity; 
}
