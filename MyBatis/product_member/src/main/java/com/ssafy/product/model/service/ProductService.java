package com.ssafy.product.model.service;

import java.util.List;

import com.ssafy.product.model.ProductDto;

public interface ProductService {
	List<ProductDto> listProduct();
	ProductDto viewProduct(String code);
	void registProduct(ProductDto productDto);
	void deleteProduct(String code);
}
