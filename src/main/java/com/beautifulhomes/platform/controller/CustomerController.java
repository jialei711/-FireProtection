package com.beautifulhomes.platform.controller;

import com.beautifulhomes.platform.bean.Customer;
import com.beautifulhomes.platform.service.CustomerService;
import com.beautifulhomes.platform.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/customer")
@RestController
public class CustomerController {

	@Autowired
	private  CustomerService customerService;
	
	@RequestMapping("/getPageCustomer")
	public String getPageBusiness(String pageIndex, String pageSize) {
		
		if("".equals(pageIndex) || "".equals(pageSize)) {
			return ResponseUtils.resultBean(false, "参数不能为空!", null, 1).toString();
		}else {
			Page<Customer> customerList = customerService.getPageRecords(Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
			return ResponseUtils.resultBean(true, "查询成功!", customerList, 0).toString();
		}
	}
	
	@RequestMapping("/getByNickName")
	public String getByNickName(String nickName) {
		
		if("".equals(nickName)) {
			return ResponseUtils.resultBean(false, "参数不能为空!", null, 1).toString();
		}else {
			List<Customer> customerList = customerService.getByNickName(nickName);
			return ResponseUtils.resultBean(true, "查询成功!", customerList, 0).toString();
		}
		
	}
	
}
