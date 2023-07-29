package com.atcs.csmall.order;

import com.atcs.csmall.order.entity.OrderEntity;
import com.atcs.csmall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsmallOrderApplicationTests {

	@Autowired
	OrderService orderService;
	@Test
	void contextLoads() {
/*		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setReceiverName("测试商品");
		if (orderService.save(orderEntity)) {
			System.out.println("新增商品成功");
		}*/
	}

}
