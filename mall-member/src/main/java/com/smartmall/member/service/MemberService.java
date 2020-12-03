package com.smartmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 17:03:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

