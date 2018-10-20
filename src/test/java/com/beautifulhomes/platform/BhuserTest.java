package com.beautifulhomes.platform;

import com.beautifulhomes.platform.bean.Bh_user;
import com.beautifulhomes.platform.bean.Business;
import com.beautifulhomes.platform.service.BhuserService;
import com.beautifulhomes.platform.service.BusinessService;
import com.beautifulhomes.platform.test.support.AbstactSpringApplicationTestSupport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BhuserTest extends AbstactSpringApplicationTestSupport {

    @Autowired
    private  BusinessService businessService;
    @Autowired
    private BhuserService bhuserService;

    @Test
    public void getAll() {
        List<Bh_user> adminList = bhuserService.getAll();
        for(Bh_user b : adminList)
        System.out.println(b.toString());
    }

    @Test
    public void update() {
        Business b = businessService.getById("402881e566048fec016604900091000b");
        b.setAddress("更新");
        businessService.add(b);
    }

    @Test
    public void delete() {
        Business b = businessService.getById("402881e566048fec016604900091000b");
        businessService.deleteBusiness(b);
    }


}
