package com.beautifulhomes.platform.service;


import com.beautifulhomes.platform.bean.Promotion;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PromotionService {

    //添加活动
    public abstract void addPromotion(Promotion p);

    //使用活动id获取活动
    public abstract Promotion getPromotionById(String id);

  //使用活动id获取活动信息
    public abstract Promotion getById(String id);

    //通过门店id获取活动信息
    public abstract List<Promotion> getByBusinessId(String businessId);

  /*//新增区间搜索  octomber
  public abstract List<PromotionRuntime> getPromotionRuntimeBySDateAndEDate(Date startTime, Date endDate);*/

    //删除活动
    public abstract void deletePromotionById(String id);

    //恢复活动
    public abstract void restorePromotionById(String id);

    //分页查询活动记录
    public abstract Page<Promotion> getPageRecords(int pageIndex, int pageSize);

    //更新活动信息
    public abstract void updatePromotion(Promotion equipment);


}
