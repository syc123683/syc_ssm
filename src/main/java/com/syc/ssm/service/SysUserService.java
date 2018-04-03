package com.syc.ssm.service;

import java.util.List;


import com.syc.ssm.domain.SysUser;

public interface SysUserService {
	
	public List<SysUser> getSysUser();
	
	public List<SysUser> getSysUserByCustomer();
	
}
