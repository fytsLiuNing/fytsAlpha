package com.fyts.admin.modules.sys.service.impl;

import org.springframework.stereotype.Service;

import com.fyts.admin.common.BaseServiceImpl;
import com.fyts.admin.modules.sys.service.IAdminService;
import com.fyts.core.modules.sys.entity.Admin;
import com.fyts.core.modules.sys.mapper.AdminMapper;

@Service
public class AdminServiceImp extends BaseServiceImpl<AdminMapper, Admin> implements IAdminService{

}
