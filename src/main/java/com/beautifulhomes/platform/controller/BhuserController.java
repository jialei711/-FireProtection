package com.beautifulhomes.platform.controller;


import com.beautifulhomes.platform.bean.Bh_user;
import com.beautifulhomes.platform.service.BhuserService;
import com.beautifulhomes.platform.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping("/admin")
@Controller
public class BhuserController {

	@Autowired
	private BhuserService bhuserService;
	
	@RequestMapping("/loginPage")
	public String goToLoginPage() {//登录页
		return "login";
	}

	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	@RequestMapping("/intergralRules")
	public String intergralRules() {
		return "/business/intergralRule";
	}
	
	@RequestMapping("/center")
	public String center() {//管理员管理中心
		return "/common/index";
	}
	
	@RequestMapping("/header")
	public String header() {//头部
		return "/common/header";
	}
	
	@RequestMapping("/left")
	public String left() {//左边
		return "/common/left";
	}
	
	@RequestMapping("/right")
	public String right() {//右边
		return "/common/right";
	}
	
	@RequestMapping("/business")
	public String manageBusiness() {//商家管理
		return "/business/businessList";
	}
	
	@ResponseBody
	@RequestMapping(value="login" ,method= RequestMethod.POST)
	public String login(String userName, String passwd, HttpServletRequest request) {
		
		if("".equals(userName) || "".equals(passwd)) {
			return ResponseUtils.resultBean(false, "用户名或密码不能为空!", null, 1).toString();
		}else {
			
			Bh_user bhuser = bhuserService.getByNameAndPassword(userName, passwd);
			if(bhuser == null) {
				return ResponseUtils.resultBean(false, "用户名或密码错误!", null, 1).toString();
			}else {
				//bhuser.setToken(UUIDUtils.getUUID());
				//bhuserService.updateToken(bhuser.getToken(), bhuser.getId());
				HttpSession session = request.getSession();
				session.setAttribute("loginUser",bhuser);
					return ResponseUtils.resultBean(true, "登录成功!", bhuser.getToken(), 1).toString();
			}
		}
	}



	@RequestMapping(value = "/loginOut", method = RequestMethod.GET)
	public String loginout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		request.removeAttribute("loginUser");
		return ResponseUtils.resultBean(true, "退出成功!", null, 1).toString();
	}



	
	@RequestMapping(value="updatePasswd" ,method= RequestMethod.POST)
	public String updatePasswd(String passwd, HttpServletRequest request) {
		
		if("".equals(passwd)) {
			return ResponseUtils.resultBean(false, "密码不能为空!", null, 1).toString();
		}else {
			HttpSession session = request.getSession();
			Bh_user bhuser = (Bh_user) session.getAttribute("bhuser");
			if(bhuser == null) {
				return ResponseUtils.resultBean(false, "请先登录!", null, 1).toString();
			}else {
				bhuserService.add(bhuser);
				System.out.println(bhuser.toString());
				return ResponseUtils.resultBean(true, "密码修改成功!", null, 0).toString();
			}
		}
	}
	

	
}
