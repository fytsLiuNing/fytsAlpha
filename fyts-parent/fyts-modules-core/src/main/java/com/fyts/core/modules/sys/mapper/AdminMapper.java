package com.fyts.core.modules.sys.mapper;

import java.util.List;

import com.fyts.core.common.base.SuperMapper;
import com.fyts.core.modules.sys.entity.Admin;

public interface AdminMapper extends SuperMapper<Admin> {
 
		List<Admin> selectAdminList();
}
