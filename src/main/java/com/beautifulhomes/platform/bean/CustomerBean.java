package com.beautifulhomes.platform.bean;

public class CustomerBean {

	private String id;
	private String phone;
	private String passwd;
	private String pubkey;
	private String name;
	private String nickname;
	private int sex;
	private String birthday;
	private String city;
	private String address;
	private String remark;
	private int del;
	private String ts;

	public CustomerBean() {
	}

	public CustomerBean(String id, String phone, String passwd, String pubkey, String name, String nickname, int sex, String birthday, String city, String address, String remark, int del, String ts, String photoaddress) {
		this.id = id;
		this.phone = phone;
		this.passwd = passwd;
		this.pubkey = pubkey;
		this.name = name;
		this.nickname = nickname;
		this.sex = sex;
		this.birthday = birthday;
		this.city = city;
		this.address = address;
		this.remark = remark;
		this.del = del;
		this.ts = ts;
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

	public String getPubkey() {
		return pubkey;
	}

	public void setPubkey(String pubkey) {
		this.pubkey = pubkey;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "CustomerBean{" +
				"id='" + id + '\'' +
				", phone='" + phone + '\'' +
				", passwd='" + passwd + '\'' +
				", pubkey='" + pubkey + '\'' +
				", name='" + name + '\'' +
				", nickname='" + nickname + '\'' +
				", sex=" + sex +
				", birthday='" + birthday + '\'' +
				", city='" + city + '\'' +
				", address='" + address + '\'' +
				", remark='" + remark + '\'' +
				", del=" + del +
				", ts='" + ts + '\'' +
				'}';
	}
}
