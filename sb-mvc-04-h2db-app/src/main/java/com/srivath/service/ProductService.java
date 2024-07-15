package com.srivath.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srivath.binding.dto.ProductDto;
import com.srivath.entity.ProductEntity;
import com.srivath.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	@Autowired
	private ModelMapper mapper;

	public Boolean saveProduct(ProductDto dto) {
		ProductEntity entity = new ProductEntity();
		BeanUtils.copyProperties(dto, entity);
		repo.save(entity);
		return true;
	}

	public List<ProductDto> getAllProducts() {
		List<ProductEntity> entities = repo.findAll();
		return entities.stream().map(entity -> mapper.map(entity, ProductDto.class)).collect(Collectors.toList());
	}
}
