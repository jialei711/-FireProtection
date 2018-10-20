package com.beautifulhomes.platform.service;

import com.beautifulhomes.platform.bean.Customer;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerService {
	
	public abstract Customer getByName(String name);
	
	public abstract List<Customer> getByNickName(String nickname);
	
	public abstract List<Customer> getBySex(int sex);
	
	public abstract List<Customer> getByCity(String city);
	
	public abstract Customer getById(String id);

    public abstract List<Customer> getAll();
    
    public abstract void add(Customer customer);
    
    public abstract void update(Customer customer);
    
    public abstract void deleteBusiness(Customer customer);
    
    public abstract Page<Customer> getPageRecords(int pageIndex, int pageSize);
}
