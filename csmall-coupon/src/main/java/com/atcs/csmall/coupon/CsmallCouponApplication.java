package com.atcs.csmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atcs.csmall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class CsmallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsmallCouponApplication.class, args);
	}

}
