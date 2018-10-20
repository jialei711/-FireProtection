package com.beautifulhomes.platform.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="business")
public class Business {
	
	private String id;
	private String phone;
	private String passwd;
	private String pubkey;
	private String name;
	private String nickname;
	private int sex;
	private Date birthday;
	private String city;
	private String address;
	private String shop_name;
	private String shop_address;
	private String remark;
	private int del;
	private Date ts;
	private String photoaddress;
	private int is_support_intergral;
	
	public Business() {}

	public Business(String id, String phone, String passwd, String pubkey, String name, String nickname, int sex,
                    Date birthday, String city, String address, String shop_name, String shop_address, String remark, int del,
                    Date ts, String photoaddress) {
		super();
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
		this.shop_name = shop_name;
		this.shop_address = shop_address;
		this.remark = remark;
		this.del = del;
		this.ts = ts;
		this.photoaddress = photoaddress;
	}
	
	public Business(String id, String phone, String passwd, String pubkey, String name, String nickname, int sex,
                    Date birthday, String city, String address, String shop_name, String shop_address, String remark, int del,
                    Date ts, String photoaddress, int is_support_intergral) {
		super();
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
		this.shop_name = shop_name;
		this.shop_address = shop_address;
		this.remark = remark;
		this.del = del;
		this.ts = ts;
		this.photoaddress = photoaddress;
		this.is_support_intergral = is_support_intergral;
	}

	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
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

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public String getPhotoaddress() {
		return photoaddress;
	}

	public void setPhotoaddress(String photoaddress) {
		this.photoaddress = photoaddress;
	}

	public int getIs_support_intergral() {
		return is_support_intergral;
	}

	public void setIs_support_intergral(int is_support_intergral) {
		this.is_support_intergral = is_support_intergral;
	}

	@Override
	public String toString() {
		return "Business [id=" + id + ", phone=" + phone + ", passwd=" + passwd + ", pubkey=" + pubkey + ", name="
				+ name + ", nickname=" + nickname + ", sex=" + sex + ", birthday=" + birthday + ", city=" + city
				+ ", address=" + address + ", shop_name=" + shop_name + ", shop_address=" + shop_address + ", remark="
				+ remark + ", del=" + del + ", ts=" + ts + ", photoaddress=" + photoaddress + ", is_support_intergral="
				+ is_support_intergral + "]";
	}
}
