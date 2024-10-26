package com.ssafy.product.model;

public class ProductDto {

	private String code;
	private String model;
	private int price;
	private String id;
	private String register_date;
	private String desc;

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRegister_date() {
		return register_date;
	}
	
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "ProductDto [code=" + code + ", model=" + model + ", price=" + price + ", id=" + id + ", register_date="
				+ register_date + ", desc=" + desc + "]";
	}

}
