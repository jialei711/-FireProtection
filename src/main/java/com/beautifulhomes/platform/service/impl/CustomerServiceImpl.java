package com.beautifulhomes.platform.service.impl;

import com.beautifulhomes.platform.bean.Customer;
import com.beautifulhomes.platform.repository.CustomerRepository;
import com.beautifulhomes.platform.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer getByName(String name) {
		return customerRepository.getByName(name);
	}

	@Override
	public List<Customer> getByNickName(String nickname) {
		return customerRepository.getByNickname(nickname);
	}

	@Override
	public List<Customer> getBySex(int sex) {
		return customerRepository.getBySex(sex);
	}

	@Override
	public List<Customer> getByCity(String city) {
		return customerRepository.getByCity(city);
	}

	@Override
	public Customer getById(String id) {
		Optional<Customer> optionBusiness = customerRepository.findById(id);
		if(optionBusiness.isPresent()) {
			return optionBusiness.get();
		}else {
			return null;
		}
	}
	
	@Override
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

	@Override
	public void add(Customer customer) {

		customerRepository.save(customer);
	}

	@Override
	public void update(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public void deleteBusiness(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Page<Customer> getPageRecords(int pageIndex, int pageSize) {
		return customerRepository.findAll(new PageRequest(pageIndex, pageSize));
	}

	

}
