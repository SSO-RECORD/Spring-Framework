package com.ssafy.product.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.product.model.ProductDto;
import com.ssafy.product.model.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	//private final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<ProductDto> list = productService.listProduct();
		mav.addObject("products", list);
		mav.setViewName("product/list");
		return mav;
	}
	
	@GetMapping("/view")
	public String view(@RequestParam("productCode") String code, Model model) {
		ProductDto productDto = productService.viewProduct(code);
		model.addAttribute("product", productDto);
		return "product/view";	
	}
	
	@GetMapping("/goRegist")
	public String goResgit() {
		return "product/regist";
	}
	
	@PostMapping("/regist")
	public String regist(@RequestParam("code") String code,
			@RequestParam("model") String model,
			@RequestParam("price") int price,
			@RequestParam("userId") String id,
			@RequestParam("detail") String desc) {
		ProductDto productDto = new ProductDto();
		productDto.setCode(code);
		productDto.setModel(model);
		productDto.setPrice(price);
		productDto.setId(id);
		productDto.setDesc(desc);
		
		productService.registProduct(productDto);
		
		return "redirect:/product/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("productCode") String code) {
		productService.deleteProduct(code);
		return "redirect:/product/list";
	}
	
}
