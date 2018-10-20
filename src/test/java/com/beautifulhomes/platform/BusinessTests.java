package com.beautifulhomes.platform;

import com.beautifulhomes.platform.bean.Business;
import com.beautifulhomes.platform.bean.BusinessQueryBean;
import com.beautifulhomes.platform.service.BusinessService;
import com.beautifulhomes.platform.util.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessTests {

	@Autowired
	private BusinessService businessService;
	
	@Test
	public void add() {
		
		for(int i=100; i<100; i++) {
			
			Business business = new Business();
			business.setAddress("地址"+i);
			//business.setBirthday(new Date(System.currentTimeMillis() + i * 2000));
			business.setCity("城市"+i);
			business.setDel(0);
			business.setName("赵六"+i);
			business.setNickname("哈哈"+i);
			business.setPasswd("abc123"+i);
			business.setPhone("1886664898"+i);
			business.setPhotoaddress("****************************"+i);
			business.setPubkey("ajhdjashdakjahdajsdhajsd099-asdasda"+i);
			business.setRemark("备注"+i);
			//business.setSex(i%2);
			business.setShop_address("商店"+i);
			business.setShop_name("商店名称"+i);
			business.setIs_support_intergral(0);
			business.setTs(new Date(System.currentTimeMillis() + i * 5000));
			businessService.add(business);
		}
	}
	
	@Test
	public void getAll() {
		List<Business>  businessList = businessService.getAll();
		for(Business b : businessList) {
			System.out.println(b.toString());
		}
	}
	
	
	@Test
	public void getById() {
		Business b = businessService.getById("402881e566048fec016604900091000b");
		System.out.println(b.toString());
	}
	
	@Test
	public void deleteById(){
		Business b = businessService.getById("402881e566048fec016604900091000b");
		b.setDel(1);
		businessService.add(b);
		
	}
	
	@Test
	public void detletById() {
		businessService.deleteBusinessById("2c9088996614387e016614388d210000");
	}
	
	@Test
	public void update() {
		Business b = businessService.getById("402881e566048fec016604900091000b");
		b.setAddress("更新");
		businessService.add(b);
	}
	
	
	@Test
	public void getPage() {
		Page<Business> businessList = businessService.getPageRecords(0, 6);
		for(Business b : businessList) {
			System.out.println(b.toString());
		}
	}
	
	
	@Test
	public void getByName() {
		
		Business b = businessService.getByName("赵六11");
		System.out.println(b.toString());
	}

	@Test
	public void getByNickName() {
		Business b = businessService.getByNickName("哈哈11").get(0);
		System.out.println(b.toString());
	}
	
	@Test
	public void getBySex() {
		List<Business> blist = businessService.getBySex(0);
		for(Business b : blist) {
			System.out.println(b.toString());
		}
	}
	
	@Test
	public void getByCity() {
		List<Business> blist = businessService.getByCity("城市19");
		for(Business b : blist) {
			System.out.println(b.toString());
		}
	}
	
	@Test
	public void getPages() {
		
		Page<Business> blist = businessService.getPageRecordsByStatus(0, 0, 10);
		for(Business b : blist) {
			System.out.println(b.toString());
		}
	}
	
	@Test
	public void updateInfor() {
		Business b = businessService.getById("2c9088996614387e016614388d6f0001");
		b.setAddress("更新的地址");
		/*b.setBirthday(new Date());*/
		b.setCity("城市济南");
		b.setName("测试");
		businessService.updateBusiness(b);
	}
	
	@Test
	public void fuzzyQuery() {
		BusinessQueryBean queryBean = new BusinessQueryBean();
		queryBean.setCity("城市1");
		queryBean.setShop_name("商店名称1");
		Page<Business> pageList = businessService.FuzzyQuery(0, 6, queryBean);
		for(Business b : pageList.getContent()) {
			System.out.println(b.toString());
		}
	}
	
	@Test
	public void dateTest() {
		
		String date = "2018-10-18";
		Date dt = DateUtils.getFormDate(date);
		System.out.println(dt.toString());
	}
	
	@Test
	public void getDate() {
		Date date = DateUtils.getCurrentTime();
		System.out.println(date.toString());
	}
}
