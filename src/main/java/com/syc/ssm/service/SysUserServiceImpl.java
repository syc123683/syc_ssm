package com.syc.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syc.ssm.dao.SysUserMapper;
import com.syc.ssm.domain.SysUser;
import com.syc.ssm.domain.SysUserExample;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SysUser> getSysUser() {
		SysUserExample example = new SysUserExample();
		example.createCriteria().andAddressLike("%四川%").andIdBetween(1, 100);
		return sysUserMapper.selectByExample(example);
	}

	@Override
	public List<SysUser> getSysUserByCustomer() {
		return sysUserMapper.selectByCustomer();
	}

}
