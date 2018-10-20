package com.beautifulhomes.platform.bean;

public class BusinessPageBean {

	private String limit;
	private String offset;
	private String page;
	private String id;
	private String city;
	private String shop_name;
	
	public BusinessPageBean() {}
	
	public BusinessPageBean(String limit, String offset, String page, String id, String city, String shop_name) {
		this.limit = limit;
		this.offset = offset;
		this.page = page;
		this.id = id;
		this.city = city;
		this.shop_name = shop_name;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
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
		return "BusinessPageBean [limit=" + limit + ", offset=" + offset + ", page=" + page + ", id=" + id + ", city="
				+ city + ", shop_name=" + shop_name + "]";
	}
	
}
