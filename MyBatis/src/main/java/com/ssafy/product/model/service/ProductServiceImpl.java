package com.ssafy.product.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.product.model.ProductDto;
import com.ssafy.product.model.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductMapper productMapper;
	
	public ProductServiceImpl(ProductMapper productMapper) {
		super();
		this.productMapper = productMapper;
	}
	
	@Override
	public List<ProductDto> listProduct() {
		return productMapper.listProduct();
	}

	@Override
	public ProductDto viewProduct(String code) {
		return productMapper.viewProduct(code);
	}

	@Override
	public void registProduct(ProductDto productDto) {
		productMapper.registProduct(productDto);
		
	}

	@Override
	public void deleteProduct(String code) {
		productMapper.deleteProduct(code);
	}

}
