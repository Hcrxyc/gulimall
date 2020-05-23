package com.zc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zc.common.utils.PageUtils;
import com.zc.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zc
 * @email hcrxyc@163.com
 * @date 2020-05-23 17:41:17
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
