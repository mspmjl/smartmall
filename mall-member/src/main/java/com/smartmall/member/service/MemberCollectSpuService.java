package com.smartmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 17:03:31
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

