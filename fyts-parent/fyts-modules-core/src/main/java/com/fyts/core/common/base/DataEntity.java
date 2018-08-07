package com.fyts.core.common.base;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * 业务基础实体类
 * @author liuning
 *
 * @param <T>
 */
public abstract class DataEntity<T extends Model> extends BaseEntity<T>  {
	
	@Override
	public void preInsert() {
		
	}

	@Override
	public void preUpdate() {
		
	}
 
}
