package com.atcs.csmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.atcs.csmall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RefreshScope
public class CsmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsmallMemberApplication.class, args);
	}

}
