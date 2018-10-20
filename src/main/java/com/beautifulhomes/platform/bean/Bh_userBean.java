package com.beautifulhomes.platform.bean;

public class Bh_userBean {

	private String id;
	private String nickName;
	private String passwd;
	private String phone;
	private String token;
	private String lastLogin;
	private String RegTime;
	private String ts;

	public Bh_userBean() {}

	public Bh_userBean(String id, String nickName, String passwd, String phone, String token, String lastLogin, String regTime, String ts) {
		this.id = id;
		this.nickName = nickName;
		this.passwd = passwd;
		this.phone = phone;
		this.token = token;
		this.lastLogin = lastLogin;
		RegTime = regTime;
		this.ts = ts;
	}

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

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getRegTime() {
		return RegTime;
	}

	public void setRegTime(String regTime) {
		RegTime = regTime;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "Bh_userBean{" +
				"id='" + id + '\'' +
				", nickName='" + nickName + '\'' +
				", passwd='" + passwd + '\'' +
				", phone='" + phone + '\'' +
				", token='" + token + '\'' +
				", lastLogin='" + lastLogin + '\'' +
				", RegTime='" + RegTime + '\'' +
				", ts='" + ts + '\'' +
				'}';
	}
}
