package com.smartmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stmartmall.common.utils.PageUtils;
import com.smartmall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-11-11 21:18:45
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

