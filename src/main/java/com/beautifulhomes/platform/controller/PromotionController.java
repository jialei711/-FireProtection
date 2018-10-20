package com.beautifulhomes.platform.controller;

import com.beautifulhomes.platform.bean.PageBean;
import com.beautifulhomes.platform.bean.Promotion;
import com.beautifulhomes.platform.bean.PromotionBean;
import com.beautifulhomes.platform.service.PromotionService;
import com.beautifulhomes.platform.util.ResponseUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/promotion")
public class PromotionController {

	@Autowired
	private PromotionService promotionService;


	@RequestMapping("/getPagePromotion")
	public String getPageEquipment(String pageIndex, String pageSize, Model model) {

		if("".equals(pageIndex) || "".endsWith(pageSize)) {
			 model.addAttribute("message", "参数不能为空!");
	    	 return "/common/error";
		}else {
			Page<Promotion> pageList = promotionService.getPageRecords(Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
			model.addAttribute("promotionList", pageList);
	    	return "/promotionList";
		}
	}

	@RequestMapping("/promotionList")
	public String promotionList() {
		return "/promotionTableList";
	}

	@ResponseBody
	@RequestMapping("/list")
	public String getEquipmentPageInfor(@RequestBody PageBean pageBean) {

//		int page = Integer.valueOf(pageBean.get);
		int pageSize = Integer.valueOf(pageBean.getLimit());
		int pageIndex = Integer.valueOf(pageBean.getPage()) - 1;

	    Page<Promotion> pageList = promotionService.getPageRecords(pageIndex, pageSize);
	    List<Promotion> promotionList = pageList.getContent();
	    List<PromotionBean> promotionBeanList = new ArrayList<PromotionBean>();
	    for(Promotion p: promotionList) {
			promotionBeanList.add(new PromotionBean(p.getId(), p.getBusinessId(), p.getTheme(), p.getName(), p.getCity(),p.getStart().toString(),p.getEnd().toString(),p.getDetails(), p.getRemark(), p.getDel(), p.getTs().toString()));
	    }

	    String res = ResponseUtils.resultPageBean(pageList.getTotalElements(), promotionBeanList).toString();
	    return res;

	}

	//增加设备 october8th
	@ResponseBody
	@RequestMapping("/addPromotion")
	public String addEquipment(String addId) {
			if (StringUtils.isEmpty(addId)) {
				return ResponseUtils.resultBean(false, "参数不能为空", null, 0).toString();
			}
			return ResponseUtils.resultBean(true, "添加成功", null, 1).toString();
	}

	@ResponseBody
	@RequestMapping("/deletePromotionById")
	public String deltePromotionById(String deleteId) {

		if(StringUtils.isEmpty(deleteId)) {
			return ResponseUtils.resultBean(false, "参数异常!", null, 0).toString();
		}else {
			promotionService.deletePromotionById(deleteId);
			return ResponseUtils.resultBean(true, "删除成功！", null, 1).toString();
		}

	}

	@ResponseBody
	@RequestMapping("/restorePromotionById")
	public String restoreEquipmentById(String deleteId) {

		if(StringUtils.isEmpty(deleteId)) {
			return ResponseUtils.resultBean(false, "参数异常!", null, 0).toString();
		}else {
			promotionService.restorePromotionById(deleteId);
			return ResponseUtils.resultBean(true, "删除成功！", null, 0).toString();
		}

	}

	@ResponseBody
	@RequestMapping("/updateEquipmentById")
	public String equipmentInforById(String businessId, String theme, String name, String city, Date start, Date end, String details, String remark, String id) {
		if(StringUtils.isEmpty(id)) {
			return ResponseUtils.resultBean(false, "参数异常!", null, 0).toString();
		}else {
			
			Promotion promotion = promotionService.getById(id);
			promotion.setBusinessId(businessId);
			promotion.setName(name);
			promotion.setCity(city);
			/*promotion.setStart(start);
			promotion.setEnd(end);*/
			promotion.setDetails(details);
			promotion.setRemark(remark);
			promotionService.addPromotion(promotion);
		}

		return ResponseUtils.resultBean(true, "操作成功", null, 0).toString();
		
	}
	
}
