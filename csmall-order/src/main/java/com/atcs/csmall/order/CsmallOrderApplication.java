package com.atcs.csmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atcs.csmall.order.dao")
@SpringBootApplication
public class CsmallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsmallOrderApplication.class, args);
	}

}
