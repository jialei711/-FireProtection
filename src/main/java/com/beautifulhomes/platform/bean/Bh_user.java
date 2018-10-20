package com.beautifulhomes.platform.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="bh_user")
public class Bh_user {

	private String id;
	private String nickName;
	private String passwd;
	private String phone;
	private String token;
	private Date RegTime;
	private Date lastLogin;
	private String ts;
	
	public Bh_user() {}


	public Bh_user(String id, String nickName, String passwd, String phone, String token, Date regTime, Date lastLogin, String ts) {
		this.id = id;
		this.nickName = nickName;
		this.passwd = passwd;
		this.phone = phone;
		this.token = token;
		RegTime = regTime;
		this.lastLogin = lastLogin;
		this.ts = ts;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getRegTime() {
		return RegTime;
	}

	public void setRegTime(Date regTime) {
		RegTime = regTime;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}


	@Override
	public String toString() {
		return "Bh_user{" +
				"id='" + id + '\'' +
				", nickName='" + nickName + '\'' +
				", passwd='" + passwd + '\'' +
				", phone='" + phone + '\'' +
				", token='" + token + '\'' +
				", RegTime=" + RegTime +
				", lastLogin=" + lastLogin +
				", ts='" + ts + '\'' +
				'}';
	}
}
