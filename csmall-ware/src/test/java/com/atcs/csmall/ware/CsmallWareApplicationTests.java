package com.atcs.csmall.ware;

import com.atcs.csmall.ware.entity.WareInfoEntity;
import com.atcs.csmall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsmallWareApplicationTests {
	@Autowired
	WareInfoService wareInfoService;
	@Test
	void contextLoads() {
/*		WareInfoEntity wareInfoEntity = new WareInfoEntity();
		wareInfoEntity.setName("三星手机");
		wareInfoService.save(wareInfoEntity);*/
	}

}
