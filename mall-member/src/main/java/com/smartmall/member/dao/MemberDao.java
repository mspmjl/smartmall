package com.smartmall.member.dao;

import com.smartmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 17:03:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
