package com.zc.gulimall.member.dao;

import com.zc.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zc
 * @email hcrxyc@163.com
 * @date 2020-05-23 18:59:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
