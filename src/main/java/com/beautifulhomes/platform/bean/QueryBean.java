package com.beautifulhomes.platform.bean;

public class QueryBean {
	
	private String name;
	private String address;
	private String customerId;
	private String beginTime;
	private String endTime;
	
	public QueryBean() {}

	public QueryBean(String name, String address, String beginTime, String endTime) {
		super();
		this.name = name;
		this.address = address;
		this.beginTime = beginTime;
		this.endTime = endTime;
	}


	public QueryBean(String name, String address, String customerId, String beginTime, String endTime) {
		this.name = name;
		this.address = address;
		this.customerId = customerId;
		this.beginTime = beginTime;
		this.endTime = endTime;
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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
		return "QueryBean [name=" + name + ", address=" + address + ", customerId=" + customerId + ", beginTime="
				+ beginTime + ", endTime=" + endTime + "]";
	}
	

}
