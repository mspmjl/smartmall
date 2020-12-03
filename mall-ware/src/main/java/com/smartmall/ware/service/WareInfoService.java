package com.smartmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 17:13:46
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

