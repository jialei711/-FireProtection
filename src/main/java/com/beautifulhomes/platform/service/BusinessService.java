package com.beautifulhomes.platform.service;

import com.beautifulhomes.platform.bean.Business;
import com.beautifulhomes.platform.bean.BusinessQueryBean;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BusinessService {
	
	public abstract Business getByName(String name);
	
	public abstract List<Business> getByNickName(String nickname);
	
	public abstract List<Business> getBySex(int sex);
	
	public abstract List<Business> getByCity(String city);
	
	public abstract Business getById(String id);

    public abstract List<Business> getAll();
    
    public abstract void add(Business business);
    
    public abstract void update(Business business);
    
    public abstract void updateBusiness(Business business);
    
    public abstract void deleteBusiness(Business business);
    
    public abstract void deleteBusinessById(String id);
    
    public abstract void restoreBusinessById(String id);
    
    public abstract Page<Business> getPageRecords(int pageIndex, int pageSize);
    
    public abstract Page<Business> getPageRecordsByStatus(int del, int pageIndex, int pageSize);
    
    public abstract Page<Business> FuzzyQuery(int pageIndex, int pageSize, BusinessQueryBean queryBean);//模糊查询
}
