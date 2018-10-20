package com.beautifulhomes.platform.service.impl;

import com.beautifulhomes.platform.bean.Promotion;
import com.beautifulhomes.platform.repository.PromotionRepository;
import com.beautifulhomes.platform.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PromotionServiceImpl implements PromotionService {
   
	@Autowired
    private PromotionRepository promotionRepository;

    @Override
    public void addPromotion(Promotion e) {
        promotionRepository. save(e);
    }

    @Override
    public Promotion getPromotionById(String id) {
        return promotionRepository.getPromotionById(id);
    }

    @Override
    public Promotion getById(String id) {
        return null;
    }

    @Override
    public List<Promotion> getByBusinessId(String businessId) {
        return promotionRepository.getPromotionByBusinessId(businessId);
    }

    @Override
    public void deletePromotionById(String id) {
        promotionRepository.deletePromotionById(1,id);
    }

    @Override
    public void restorePromotionById(String id) {
        promotionRepository.restorePromotionById(0,id);
    }

    @Override
    public Page<Promotion> getPageRecords(int pageIndex, int pageSize) {
        return promotionRepository.findAll(new PageRequest(pageIndex, pageSize));
    }

    @Override
    public void updatePromotion(Promotion p) {
        promotionRepository.updatePromotion(p.getBusinessId(), p.getTheme(), p.getName(), p.getCity(), p.getStart() ,p.getEnd(), p.getDetails(), p.getRemark(), p.getId());
    }

}
