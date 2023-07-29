package com.atcs.csmall.member.dao;

import com.atcs.csmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 19:07:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
