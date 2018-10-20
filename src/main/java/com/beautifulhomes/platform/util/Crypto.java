package com.beautifulhomes.platform.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Crypto {
	
	private static final Logger logger = LoggerFactory.getLogger(Crypto.class);
	
	public static String hash(String s) {
//		return s;
		
		if (s.isEmpty()) {
			logger.warn("error: hash string is null!");
            return "";
        }
        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("SHA1");
            byte[] bytes = hash.digest(s.getBytes("UTF-8"));
            String result = "";
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result += temp;
            }
            return result;
        } catch (NoSuchAlgorithmException e) {
        	logger.error(e.toString());
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
        	logger.error(e.toString());
            e.printStackTrace();
        }
        return "";
	}
}
