package com.beautifulhomes.platform.bean;

public class FuzzyQueryBean {
	
	private String name;
	private String address;
	private String customerId;
	
	public FuzzyQueryBean() {}

	
	public FuzzyQueryBean(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public FuzzyQueryBean(String name, String address, String customerId) {
		super();
		this.name = name;
		this.address = address;
		this.customerId = customerId;
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

	@Override
	public String toString() {
		return "FuzzyQueryBean [name=" + name + ", address=" + address + ", customerId=" + customerId + "]";
	}

	
	
}
