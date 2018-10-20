package com.beautifulhomes.platform.bean;

public class PageBean {
	
	private String limit;
	private String offset;
	private String page;
	private String name;
	private String address;
	private String phone;
	private String beginTime;
	private String endTime;
	
	public PageBean() {}

	public PageBean(String limit, String offset, String page, String name, String address) {
		super();
		this.limit = limit;
		this.offset = offset;
		this.page = page;
		this.name = name;
		this.address = address;
	}

	public PageBean(String limit, String offset, String page, String name, String address, String phone,
			String beginTime, String endTime) {
		super();
		this.limit = limit;
		this.offset = offset;
		this.page = page;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.beginTime = beginTime;
		this.endTime = endTime;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "PageBean [limit=" + limit + ", offset=" + offset + ", page=" + page + ", name=" + name + ", address="
				+ address + ", phone=" + phone + ", beginTime=" + beginTime + ", endTime=" + endTime + "]";
	}
	
}
