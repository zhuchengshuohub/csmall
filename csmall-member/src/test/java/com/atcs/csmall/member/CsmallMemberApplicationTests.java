package com.atcs.csmall.member;

import com.atcs.csmall.member.entity.MemberEntity;
import com.atcs.csmall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsmallMemberApplicationTests {

	@Autowired
	MemberService memberService;
	@Test
	void contextLoads() {
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setCity("北京");
		memberService.save(memberEntity);
	}

}
