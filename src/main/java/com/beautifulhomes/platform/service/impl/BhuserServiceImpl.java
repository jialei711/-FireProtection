package com.beautifulhomes.platform.service.impl;


import com.beautifulhomes.platform.bean.Bh_user;
import com.beautifulhomes.platform.repository.BhuserRepository;
import com.beautifulhomes.platform.service.BhuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BhuserServiceImpl implements BhuserService {

	@Autowired
    private BhuserRepository adminRepository;
	
	@Override
	public Bh_user getByNameAndPassword(String nickName, String passwd) {
		return adminRepository.getByNameAndPassword(nickName, passwd);
	}

	@Override
	public void add(Bh_user bhuser) {
		adminRepository.save(bhuser);
	}

	@Override
	public List<Bh_user> getAll() {
		return adminRepository.findAll();
	}

	@Override
	public void deleteById(String id) {
		adminRepository.deleteById(id);
	}

	@Override
	public Bh_user getByToken(String token) {
		return adminRepository.getByToken(token);
	}

	@Override
	public void updateToken(String token, String id) {
		adminRepository.updateNameById(token, id);	
	}

}
