package com.grain.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grain.common.utils.PageUtils;
import com.grain.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author Dragon Wen
 * @email 18475536452@163.com
 * @date 2020-05-23 15:04:44
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

