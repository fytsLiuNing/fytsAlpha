package com.fyts.core.common.base;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 基础ORM接口
 * @author liuning
 *
 * @param <T>
 */
public interface SuperMapper<T> extends BaseMapper<T> {

    // 这里可以放一些公共的方法
}
