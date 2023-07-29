package com.atcs.csmall.product;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atcs.csmall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class CsmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsmallProductApplication.class, args);
	}

}
