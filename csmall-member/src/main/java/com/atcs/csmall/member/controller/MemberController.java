package com.atcs.csmall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.atcs.csmall.member.feign.FeignQuerymembercouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.csmall.member.entity.MemberEntity;
import com.atcs.csmall.member.service.MemberService;
import com.atcs.common.utils.PageUtils;
import com.atcs.common.utils.R;



/**
 * 会员
 *
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 19:07:32
 */
@RestController
//@RefreshScope
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private FeignQuerymembercouponsService querymembercouponsService;
    @Value("${user.name}")
    String username;
    @Value("${user.sex}")
    String usersex;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }
    @RequestMapping("/queryMemeberCoupons")
    private R queryMemeberCoupons(){
        MemberEntity member = memberService.getById(1L);
        R querymembercouponsed = querymembercouponsService.querymembercoupons();
        return R.ok(querymembercouponsed).put("member",member);
    }

    @RequestMapping("/getNacosConfigValue")
    public R getNacosConfigValue(){
        return R.ok().put("username",username).put("usersex",usersex);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
