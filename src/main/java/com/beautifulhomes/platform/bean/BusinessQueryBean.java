package com.beautifulhomes.platform.bean;

public class BusinessQueryBean {
	
	private String id;
	private String city;
	private String shop_name;
	
	public BusinessQueryBean() {}

	public BusinessQueryBean(String id, String city, String shop_name) {
		this.id = id;
		this.city = city;
		this.shop_name = shop_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	@Override
	public String toString() {
		return "BusinessQueryBean [id=" + id + ", city=" + city + ", shop_name=" + shop_name + "]";
	}

}
