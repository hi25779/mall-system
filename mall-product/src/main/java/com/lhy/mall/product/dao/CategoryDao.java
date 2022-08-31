package com.lhy.mall.product.dao;

import com.lhy.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lhy
 * @email lihaoyuan01@gmail.com
 * @date 2022-08-31 21:58:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
