package com.beautifulhomes.platform.filter;

import com.beautifulhomes.platform.bean.Bh_user;
import com.beautifulhomes.platform.service.BhuserService;
import com.beautifulhomes.platform.util.FilterUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebFilter(filterName="tokenFilter", urlPatterns= {"/*"})
public class TokenFilter implements Filter {

	@Autowired
	private BhuserService adminService;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		HttpServletResponse response = (HttpServletResponse) servletresponse;
		String accessUrl = request.getRequestURI();
//		System.out.println(accessUrl);
		if(canAccess(accessUrl)) {
			chain.doFilter(servletrequest, servletresponse);
		}else {
			
//			chain.doFilter(servletrequest, servletresponse);
			
			Bh_user admin = (Bh_user) request.getSession().getAttribute("loginUser");
//			Admin admin = adminService.getByToken(token);
			
			if(admin != null) {
				chain.doFilter(servletrequest, servletresponse);
			}else {
//				System.out.println("禁止访问，请先登录");
				response.sendRedirect("/admin/loginPage");
			}
			
		}
		
		
	}

	private boolean canAccess(String url) {//移动端前后端分离的效果
		boolean canAccessFlag = false;//是否可以访问
		
		List<String> canAccessUrlList = FilterUtils.getCanAccessUrl();
		for(String s : canAccessUrlList) {
			
			if(s.contains(url)) {
				canAccessFlag = true;
				break;
			}
		}
		
		if(url.startsWith("/static")) {
			canAccessFlag = true;
		}
		
		return canAccessFlag;
	}
	
	@Override
	public void destroy() {}

}
