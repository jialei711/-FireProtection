package com.beautifulhomes.platform;

import com.beautifulhomes.platform.bean.Promotion;
import com.beautifulhomes.platform.service.PromotionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PromotionServiceTests {

	@Autowired
	private PromotionService promotionService;


	@Test
	public void add() {
		for(int i=0; i< 100; i++){
			Promotion p = new Promotion();
			p.setBusinessId("2c9088996614387e016614388d6f0001");
			p.setTheme("开展净水机优惠促销活动"+i);
			p.setCity("北京");
			/*p.setStart(new Date(System.currentTimeMillis()+1000*i).toString());
			p.setEnd(new Date(System.currentTimeMillis()+86400*i).toString());*/
			p.setDetails("2018年第"+i+"次活动");
			p.setRemark("正常");
		}
	}
	
	
	@Test
	public void getAll(){
		Page<Promotion> promotionsList = promotionService.getPageRecords(1,8);
		for (Promotion p : promotionsList) {
			System.out.println(p.toString());
		}
	}

	@Test
	public void getById() {
		Promotion p = promotionService.getPromotionById("11111111111119");
		System.out.println(p.toString());
	}


	@Test
	public void deleteById(){
		promotionService.deletePromotionById("402883e566424c870166424c998c0008");
		
	}
	
	@Test
	public void restorePromotion() {
		promotionService.restorePromotionById("402883e566424c870166424c998c0008");
	}
	

	@Test
	public void getByBusinessId() {
		List<Promotion> eList = promotionService.getByBusinessId("2c9088996614387e016614388d6f0001");
		for(Promotion e : eList) {
			System.out.println(e.toString());
		}
	}
	
}
