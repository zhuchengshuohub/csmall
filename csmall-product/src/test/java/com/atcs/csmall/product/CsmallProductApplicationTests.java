package com.atcs.csmall.product;

import com.atcs.csmall.product.entity.BrandEntity;
import com.atcs.csmall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CsmallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("测试品牌");
//		if (brandService.save(brandEntity)) {
//			System.out.println("新增成功！");
//		}
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1L);
//		brandEntity.setName("华为品牌");
//		brandEntity.setLogo("1111111111");
//		brandEntity.setSort(10);
//		brandEntity.setShowStatus(1);
//		if (brandService.updateById(brandEntity)) {
//			System.out.println("修改成功！");
//		}
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
		list.forEach(e->{
			System.out.println(e);
		});
	}

}
