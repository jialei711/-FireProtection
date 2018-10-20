package com.beautifulhomes.platform.repository;

import com.beautifulhomes.platform.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	@Query("select b from Customer b where b.name=:name")
	public Customer getByName(@Param("name") String name);
	
	
	@Query("select b from Customer b where b.nickname=:nickname")
	public List<Customer> getByNickname(@Param("nickname") String nickname);
	
	@Query("select b from Customer b where b.sex=:sex")
	public List<Customer> getBySex(@Param("sex") int sex);
	
	@Query("select b from Customer b where b.city=:city")
	public List<Customer> getByCity(@Param("city") String city);
	
}
