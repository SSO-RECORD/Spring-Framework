package com.ssafy.product.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.product.model.ProductDto;

@Mapper
public interface ProductMapper {

	List<ProductDto> listProduct();
	ProductDto viewProduct(String code);
	void registProduct(ProductDto productDto);
	void deleteProduct(String code);
}
