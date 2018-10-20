package com.beautifulhomes.platform.repository;

import com.beautifulhomes.platform.bean.Business;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BusinessRepository extends JpaRepository<Business, String>, JpaSpecificationExecutor<Business> {

	@Query("select b from Business b where b.name=:name")
	public Business getByName(@Param("name") String name);
	
	
	@Query("select b from Business b where b.nickname=:nickname")
	public List<Business> getByNickname(@Param("nickname") String nickname);
	
	@Query("select b from Business b where b.sex=:sex")
	public List<Business> getBySex(@Param("sex") int sex);
	
	@Query("select b from Business b where b.del =:del")
	public Page<Business> getPageRecords(@Param("del") int del, Pageable pageable);
	
	@Query("select b from Business b where b.city=:city")
	public List<Business> getByCity(@Param("city") String city);
	
    @Query(value = "update Business set del =?1 where id =?2", nativeQuery = true)
    @Modifying
    public void deleteBusiness(int del, String id);
    
    @Query(value = "update Business set phone =?1, passwd=?2, name=?3, nickname=?4, city=?5, address=?6, shop_name =?7, shop_address=?8,is_support_intergral=?9 where id =?10", nativeQuery = true)
    @Modifying
    public void updateBusiness(String phone, String passwd, String name, String nickname, String city, String address, String shop_name, String shop_address, int is_support_intergral, String id);
	
}
