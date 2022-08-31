package com.lhy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhy.common.utils.PageUtils;
import com.lhy.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lhy
 * @email lihaoyuan01@gmail.com
 * @date 2022-08-31 21:58:36
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

