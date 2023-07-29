package com.atcs.csmall.coupon;

import com.atcs.csmall.coupon.entity.CouponEntity;
import com.atcs.csmall.coupon.service.CouponService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class CsmallCouponApplicationTests {

	@Autowired
	CouponService couponService;
	@Test
	void contextLoads() {
/*		CouponEntity couponEntity = new CouponEntity();
		couponEntity.setCouponName("测试优惠价");
		couponEntity.setEndTime(new Date());
		if (couponService.save(couponEntity)) {
			System.out.println("优惠价新增成功");
		}*/

/*		CouponEntity couponEntity = new CouponEntity();
		couponEntity.setId(1L);
		couponEntity.setCouponName("修改优惠价服务");
		if (couponService.updateById(couponEntity)) {
			System.out.println("修改优惠价成功！");
		}*/

/*		List<CouponEntity> list = couponService.list(new QueryWrapper<CouponEntity>().eq(true,"coupon_name", "修改优惠价服务"));
		list.forEach((iteam)->{
			System.out.println(iteam);
		});*/

	}

}
