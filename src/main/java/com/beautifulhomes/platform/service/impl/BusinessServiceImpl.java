package com.beautifulhomes.platform.service.impl;


import com.beautifulhomes.platform.bean.Business;
import com.beautifulhomes.platform.bean.BusinessQueryBean;
import com.beautifulhomes.platform.repository.BusinessRepository;
import com.beautifulhomes.platform.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessRepository businessRepository;
	
	@Override
	public Business getByName(String name) {
		return businessRepository.getByName(name);
	}

	@Override
	public List<Business> getByNickName(String nickname) {
		return businessRepository.getByNickname(nickname);
	}

	@Override
	public List<Business> getBySex(int sex) {
		return businessRepository.getBySex(sex);
	}

	@Override
	public List<Business> getByCity(String city) {
		return businessRepository.getByCity(city);
	}

	@Override
	public Business getById(String id) {
		Optional<Business> optionBusiness = businessRepository.findById(id);
		if(optionBusiness.isPresent()) {
			return optionBusiness.get();
		}else {
			return null;
		}
	}
	
	@Override
	public List<Business> getAll() {
		return businessRepository.findAll();
	}

	@Override
	public void add(Business business) {

		businessRepository.save(business);
	}

	@Override
	public void update(Business business) {
		businessRepository.save(business);
	}

	@Override
	public void deleteBusiness(Business business) {
		businessRepository.save(business);
	}

	@Override
	public Page<Business> getPageRecords(int pageIndex, int pageSize) {
		return businessRepository.findAll(new PageRequest(pageIndex, pageSize));
	}

	@Override
	public void deleteBusinessById(String id) {
		businessRepository.deleteBusiness(1,id);		
	}

	@Override
	public Page<Business> getPageRecordsByStatus(int del, int pageIndex, int pageSize) {
		
		Pageable pageable = new PageRequest(pageIndex, pageSize);
		return businessRepository.getPageRecords(0, pageable);
	}

	@Override
	public void restoreBusinessById(String id) {
		businessRepository.deleteBusiness(0,id);	
	}

	@Override
	public void updateBusiness(Business business) {
		businessRepository.updateBusiness(business.getPhone(), business.getPasswd(), business.getName(), business.getNickname(), business.getCity(), business.getAddress(), business.getShop_name(),business.getShop_address(),business.getIs_support_intergral(), business.getId());
	}

	@Override
	public Page<Business> FuzzyQuery(int pageIndex, int pageSize, BusinessQueryBean queryBean) {
		
		Pageable pageable = new PageRequest(pageIndex, pageSize, Sort.Direction.DESC, "id");
		Page<Business> equipmentPage = businessRepository.findAll(new Specification<Business>() {

			@Override
			public Predicate toPredicate(Root<Business> root, CriteriaQuery<?> query,
										 CriteriaBuilder criteriaBuilder) {
				
				List<Predicate> list = new ArrayList<Predicate>();
				
				if(queryBean.getId() != null && !"".equals(queryBean.getId())) {
					list.add(criteriaBuilder.like(root.get("id").as(String.class), "%"+queryBean.getId()+"%"));
					
					//list.add(criteriaBuilder.equal(root.get("name").as(String.class), queryBean.getName()));//精准分页查询
				}
				
				if(queryBean.getCity() != null && !"".equals(queryBean.getCity())) {
					list.add(criteriaBuilder.like(root.get("city").as(String.class), "%"+queryBean.getCity()+"%"));
				}
				
				if(queryBean.getShop_name() != null && !"".equals(queryBean.getShop_name())) {
					list.add(criteriaBuilder.like(root.get("shop_name").as(String.class), "%"+queryBean.getShop_name()+"%"));
				}
				
				Predicate[] p = new Predicate[list.size()];
				return criteriaBuilder.and(list.toArray(p));
			}
			
		}, pageable);
		
		
		return equipmentPage;
	}

	

}
