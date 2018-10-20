/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beautifulhomes.platform.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author dong
 */
public class TokenUtil {
	
	public static final long TOKEN_TIME = 30 * 60 * 1000;
	
	public static final HashMap<String,Long> hm_token = new HashMap<>();
	
	
    public static boolean getToken(String token) {
    	
    	Long token_time = hm_token.get(token);
    	if (null != token_time) {
        	Long now = new Date().getTime();        	
        	if (now - token_time < TOKEN_TIME) {
        		return true;
        	}
    	}
 
        return false;
            
    }
    public static void setToken(String token) {   	
//        if (hm_token.get(token) == null) {
        	hm_token.put(token, new Date().getTime());
//        }
    }
    
    public static void refreshToken() {
    	
    	if(hm_token.isEmpty()) {
    		return;
    	}
    	
    	Long now = new Date().getTime();
    	Set keySet = hm_token.keySet();
 
		for (Iterator it = keySet.iterator(); it.hasNext();) {
    		String key = (String)it.next();
    		Long token_time = hm_token.get(key);
    		
    		if (now - token_time >= TOKEN_TIME) {
    			hm_token.remove(key);
        	}
    	}
		
	
    	
    	
    }


    
}
