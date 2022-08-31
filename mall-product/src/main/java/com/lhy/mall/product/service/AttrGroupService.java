package com.lhy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhy.common.utils.PageUtils;
import com.lhy.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lhy
 * @email lihaoyuan01@gmail.com
 * @date 2022-08-31 21:58:36
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

