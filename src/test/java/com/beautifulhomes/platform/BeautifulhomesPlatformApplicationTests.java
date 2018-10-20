package com.beautifulhomes.platform;

import com.beautifulhomes.platform.bean.Bh_user;
import com.beautifulhomes.platform.service.BhuserService;
import com.beautifulhomes.platform.util.UUIDUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeautifulhomesPlatformApplicationTests {

	@Autowired
	private BhuserService bhuserService;
	
	@Test
	public void add() {
		
		for(int i=0; i<20; i++) {
			Bh_user admin = new Bh_user();
			admin.setNickName("张三"+i);
			admin.setPasswd("123456abc"+i);
			admin.setPhone("1558989564"+i);
			admin.setToken(UUIDUtils.getUUID());
			bhuserService.add(admin);
		}
	}
	
	@Test
	public void getAll() {
		List<Bh_user> adminList = bhuserService.getAll();
		for(Bh_user a : adminList) {
			System.out.println(a.toString());
		}
	}
	
	@Test
	public void deleteById(){
		bhuserService.deleteById("402881e5660467010166046712c90004");
		
	}
	
	@Test
	public void getByNameAndPassword() {
		Bh_user admin = bhuserService.getByNameAndPassword("张三13", "123456abc13");
		System.out.println(admin.toString());
	}

	
	@Test
	public void getByToken() {
		Bh_user admin = bhuserService.getByToken("babdae5f925f4e8fa9c708d3831a7f52");
		System.out.println(admin);
	}
	
	@Test
	public void updateTOken() {
		bhuserService.updateToken("11111111111111111111111111111", "402881e6660bd37101660bd387050007");
	}
}
