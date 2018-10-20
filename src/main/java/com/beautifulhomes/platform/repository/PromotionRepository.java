package com.beautifulhomes.platform.repository;

import com.beautifulhomes.platform.bean.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
public interface PromotionRepository extends JpaRepository<Promotion, String> {

    @Query("select p from Promotion p where p.del = 0 and p.id = :id")
    public Promotion getPromotionById(@Param("id") String id);

    @Query("select p from Promotion p where p.city = :city")
    public List<Promotion> getPromotionByCity(@Param("city") String city);

    @Query("select p from Promotion p where p.name = :name")
    public List<Promotion> getPromotionByName(@Param("name") String name);

    @Query("select p from Promotion p where p.businessId = :businessId")
    public List<Promotion> getPromotionByBusinessId(@Param("businessId") String businessId);

    @Query(value = "update Promotion set del =?1 where id =?2", nativeQuery = true)
    @Modifying
    public void deletePromotionById(int del, String id);

    @Query(value = "update Promotion set del =?0 where id =?2", nativeQuery = true)
    @Modifying
    public void restorePromotionById(int del, String id);

    @Query(value = "update Promotion set businessId =?1, theme =?2, name =?3, city=?4, start=?5, end=?6, details=?7, remark=?8,  where id =?10", nativeQuery = true)
    @Modifying
    public void updatePromotion(String businessId, String theme, String name, String city, Date start, Date end, String details, String remark, String id);

}



