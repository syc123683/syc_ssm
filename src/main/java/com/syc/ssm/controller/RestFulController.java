package com.syc.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.syc.ssm.domain.SysUser;
import com.syc.ssm.service.SysUserService;

@RestController
public class RestFulController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping(value="/sayHello",method = RequestMethod.GET)
	@ResponseBody
	public String sayHello(){

		List<SysUser> userList = sysUserService.getSysUserByCustomer();
		return JSONObject.toJSONString(userList);
    }
}
