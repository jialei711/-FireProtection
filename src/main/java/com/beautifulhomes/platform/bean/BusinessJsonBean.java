package com.beautifulhomes.platform.bean;

import java.util.Date;

public class BusinessJsonBean {

	private String id;
	private String phone;
	private String passwd;
	private String name;
	private String nickname;
	private int sex;
	private Date birthday;
	private String city;
	private String address;
	
	public BusinessJsonBean() {}

	public BusinessJsonBean(String id, String phone, String passwd, String name, String nickname,
			int sex, Date birthday, String city, String address) {
		super();
		this.id = id;
		this.phone = phone;
		this.passwd = passwd;
		this.name = name;
		this.nickname = nickname;
		this.sex = sex;
		this.birthday = birthday;
		this.city = city;
		this.address = address;
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

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
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

	@Override
	public String toString() {
		return "BusinessJsonBean [id=" + id + ", phone=" + phone + ", passwd=" + passwd + ", name=" + name
				+ ", nickname=" + nickname + ", sex=" + sex + ", birthday=" + birthday + ", city=" + city + ", address="
				+ address + "]";
	}
	
}
