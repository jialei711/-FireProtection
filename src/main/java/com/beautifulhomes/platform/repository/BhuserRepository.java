package com.beautifulhomes.platform.repository;

import com.beautifulhomes.platform.bean.Bh_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface BhuserRepository extends JpaRepository<Bh_user, String> {

	@Query("select a from Bh_user a where a.nickName=:nickName and passwd=:passwd")
	public Bh_user getByNameAndPassword(@Param("nickName") String nickName, @Param("passwd") String passwd);
	
	@Query("select a from Bh_user a where a.token=:token")
	public Bh_user getByToken(@Param("token") String token);
	
	 @Query(value = "update Bh_user set token =?1 where id =?2", nativeQuery = true)
	 @Modifying
    public void updateNameById(String token, String id); 
}
