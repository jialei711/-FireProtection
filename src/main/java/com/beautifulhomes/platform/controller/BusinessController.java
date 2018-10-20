package com.beautifulhomes.platform.controller;

import com.beautifulhomes.platform.bean.*;
import com.beautifulhomes.platform.service.BusinessService;
import com.beautifulhomes.platform.util.DateUtils;
import com.beautifulhomes.platform.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/business")
@RestController
@CrossOrigin
public class BusinessController {

	@Autowired
	private BusinessService businessService;
	
	@RequestMapping("/getPageBusiness")
	public String getPageBusiness(String pageIndex, String pageSize) {
		
		if("".equals(pageIndex) || "".equals(pageSize)) {
			return ResponseUtils.resultBean(false, "参数不能为空!", null, 1).toString();
		}else {
//			Page<Business> businessList = businessService.getPageRecordsByStatus(0, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
			Page<Business> businessList = businessService.getPageRecords(Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
			return ResponseUtils.resultBean(true, "查询成功!", businessList, 0).toString();
		}
	}
	
	@RequestMapping("/getByNickName")
	public String getByNickName(String nickName) {
		
		if("".equals(nickName)) {
			return ResponseUtils.resultBean(false, "参数不能为空!", null, 1).toString();
		}else {
			List<Business> businessList = businessService.getByNickName(nickName);
			return ResponseUtils.resultBean(true, "查询成功!", businessList, 0).toString();
		}
		
	}
	
	@RequestMapping("/deleteById")
	public String deleteBusinessById(String id) {
		try {
			businessService.deleteBusinessById(id);
			return ResponseUtils.resultBean(true, "删除成功!", null, 0).toString();
		} catch (Exception e) {
			return ResponseUtils.resultBean(false, "删除失败!", null, 1).toString();
		}
	}

	@RequestMapping("/restoreByID")
	public String restoreByID(String id) {
		try {
			businessService.restoreBusinessById(id);
			return ResponseUtils.resultBean(true, "恢复成功!", null, 0).toString();
		} catch (Exception e) {
			return ResponseUtils.resultBean(false, "恢复失败!", null, 1).toString();
		}
	}
	
	@RequestMapping("/updateinfor")
	public String updateInfor(String id, String address, String city, String name, String nickname, String passwd, String phone, String sex) {
		
		try {
			Business business = new Business();
			business.setAddress(address);
			business.setCity(city);
			business.setId(id);
			business.setName(name);
			business.setBirthday(new Date());
			business.setNickname(nickname);
			business.setPasswd(passwd);
			business.setPhone(phone);
			business.setSex(Integer.valueOf(sex));
			businessService.updateBusiness(business);
			return ResponseUtils.resultBean(true, "修改成功!", null, 0).toString();
		} catch (Exception e) {
			return ResponseUtils.resultBean(false, "修改失败!", null, 1).toString();
		}
	}
	
	@RequestMapping("/addBusiness")
	public String addBusiness(@RequestBody RequestBusinessBean businessBean) {
		
		try {
			Business business = new Business();
			business.setPhone(businessBean.getPhone());
			business.setAddress(businessBean.getAddress());
			business.setPasswd(businessBean.getPasswd());
			business.setName(businessBean.getName());
			business.setNickname(businessBean.getNickname());
			business.setSex(Integer.valueOf(businessBean.getSex()));
			business.setBirthday(DateUtils.getFormDate(businessBean.getBirthday()));
			business.setCity(businessBean.getCity());
			business.setShop_name(businessBean.getShop_name());
			business.setShop_address(businessBean.getShop_address());
			business.setRemark(businessBean.getRemark());
			business.setDel(0);
			business.setTs(DateUtils.getCurrentTime());
			businessService.add(business);
			return ResponseUtils.resultBean(true, "添加成功!", null, 0).toString();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseUtils.resultBean(false, "添加失败!", null, 1).toString();
		}
	}
	
	@RequestMapping("/updateBusiness")
	public String updateBusiness(@RequestBody RequestBusinessBean businessBean) {
		
		try {
			Business business = businessService.getById(businessBean.getId());
			business.setPhone(businessBean.getPhone());
			business.setAddress(businessBean.getAddress());
			business.setPasswd(businessBean.getPasswd());
			business.setName(businessBean.getName());
			business.setNickname(businessBean.getNickname());
			business.setSex(Integer.valueOf(businessBean.getSex()));
			business.setBirthday(DateUtils.getFormDate(businessBean.getBirthday()));
			business.setCity(businessBean.getCity());
			business.setShop_name(businessBean.getShop_name());
			business.setShop_address(businessBean.getShop_address());
			business.setRemark(businessBean.getRemark());
			businessService.updateBusiness(business);
			return ResponseUtils.resultBean(true, "修改成功!", null, 0).toString();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtils.resultBean(false, "修改失败!", null, 1).toString();
		}
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public String getBusinessPageInfor(@RequestBody BusinessPageBean pageBean) {
		
		try {
			int pageSize = Integer.valueOf(pageBean.getLimit());
			int pageIndex = Integer.valueOf(pageBean.getPage()) - 1;
			
			String businessId = pageBean.getId();
			String city = pageBean.getCity();
			String shopName = pageBean.getShop_name();
			
			List<BusinessBean> businessBeanList = new ArrayList<BusinessBean>();
			
			Page<Business> pageList = businessService.FuzzyQuery(pageIndex, pageSize, new BusinessQueryBean(businessId, city, shopName));
			for(Business b : pageList.getContent()) {
				businessBeanList.add(new BusinessBean(b.getId(), b.getPhone(), b.getName(), b.getNickname(), b.getSex(), b.getBirthday().toLocaleString(), b.getCity(), b.getAddress(), b.getShop_name(), b.getShop_address(), b.getRemark(), b.getTs().toLocaleString(), b.getPhotoaddress(), b.getPasswd(), b.getIs_support_intergral()));
			}
			
			return ResponseUtils.resultPageBean(pageList.getTotalElements(), businessBeanList).toString();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return ResponseUtils.resultPageBean(0, null).toString();
		}
	}
	
}
