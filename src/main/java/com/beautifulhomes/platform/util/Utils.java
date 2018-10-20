package com.beautifulhomes.platform.util;

import java.util.HashMap;
import java.util.UUID;

public class Utils {
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static HashMap<String,Object> getHM(){
		return new HashMap<String,Object>();
	}
}
