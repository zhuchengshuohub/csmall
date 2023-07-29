package com.atcs.csmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atcs.csmall.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class CsmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsmallWareApplication.class, args);
	}

}
