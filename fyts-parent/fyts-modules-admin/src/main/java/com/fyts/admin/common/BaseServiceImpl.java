package com.fyts.admin.common;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.fyts.core.common.base.SuperMapper;

public class BaseServiceImpl<M extends SuperMapper<T> ,T> extends ServiceImpl<M,T> implements IBaseService<T>{

}
