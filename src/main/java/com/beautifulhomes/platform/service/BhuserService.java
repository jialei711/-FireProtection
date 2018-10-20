package com.beautifulhomes.platform.service;

import com.beautifulhomes.platform.bean.Bh_user;

import java.util.List;

public interface BhuserService {
	
	public abstract Bh_user getByNameAndPassword(String nickName, String passwd);
	
	public abstract Bh_user getByToken(String token);
	
	public abstract void add(Bh_user admin);
	
	public abstract List<Bh_user> getAll();
	
	public abstract void deleteById(String id);
	
	public abstract void updateToken(String token, String id);

}
