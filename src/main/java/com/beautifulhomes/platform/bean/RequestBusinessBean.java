package com.beautifulhomes.platform.bean;


public class RequestBusinessBean {
	
	private String id;
	private String phone;
	private String passwd;
	private String name;
	private String nickname;
	private String sex;
	private String birthday;
	private String city;
	private String address;
	private String shop_name;
	private String shop_address;
	private String remark;
	private int is_support_intergral;

	public RequestBusinessBean() {
	}

	public RequestBusinessBean(String id, String phone, String passwd, String name, String nickname, String sex, String birthday, String city, String address, String shop_name, String shop_address, String remark, int is_support_intergral) {
		this.id = id;
		this.phone = phone;
		this.passwd = passwd;
		this.name = name;
		this.nickname = nickname;
		this.sex = sex;
		this.birthday = birthday;
		this.city = city;
		this.address = address;
		this.shop_name = shop_name;
		this.shop_address = shop_address;
		this.remark = remark;
		this.is_support_intergral = is_support_intergral;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getShop_address() {
		return shop_address;
	}

	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getIs_support_intergral() {
		return is_support_intergral;
	}

	public void setIs_support_intergral(int is_support_intergral) {
		this.is_support_intergral = is_support_intergral;
	}

	@Override
	public String toString() {
		return "RequestBusinessBean{" +
				"id='" + id + '\'' +
				", phone='" + phone + '\'' +
				", passwd='" + passwd + '\'' +
				", name='" + name + '\'' +
				", nickname='" + nickname + '\'' +
				", sex='" + sex + '\'' +
				", birthday='" + birthday + '\'' +
				", city='" + city + '\'' +
				", address='" + address + '\'' +
				", shop_name='" + shop_name + '\'' +
				", shop_address='" + shop_address + '\'' +
				", remark='" + remark + '\'' +
				", is_support_intergral=" + is_support_intergral +
				'}';
	}
}
