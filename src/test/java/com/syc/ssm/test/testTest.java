package com.syc.ssm.test;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import com.syc.ssm.dao.SysUserMapper;
import com.syc.ssm.domain.SysUserExample;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath*:spring/spring.xml"})
public class testTest {
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Before
	public void testBefore(){
		System.out.println("before .....................");
	}
	
	@Test
	public void testDao(){
		SysUserExample example = new SysUserExample();
		Assert.assertTrue(sysUserMapper.countByExample(example) > 0);
	}
	
	@After
	public void testAfter(){
		System.out.println("after.........................");
	}
}
