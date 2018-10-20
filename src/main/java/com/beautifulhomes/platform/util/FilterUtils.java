package com.beautifulhomes.platform.util;

import java.util.ArrayList;
import java.util.List;

public class FilterUtils {
	
	public static List<String> getCanAccessUrl(){
		
		List<String> canAccessUrlList = new ArrayList<String>();
		canAccessUrlList.add("/admin/login");
		canAccessUrlList.add("/admin/loginPage");
//		canAccessUrlList.add("/static/css/bootstrap.min.css");
//		canAccessUrlList.add("/static/js/angular.min.js");
		return canAccessUrlList;
	}

}
