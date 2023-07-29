package com.atcs.csmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atcs.csmall.member.dao")
@SpringBootApplication
public class CsmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsmallMemberApplication.class, args);
	}

}
