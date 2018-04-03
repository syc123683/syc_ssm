package com.syc.ssm.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;


@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath*:spring/spring.xml"})
public class testTest {
	@Autowired
	
	@Before
	public void testBefore(){
		System.out.println("before .....................");
	}
	
	@Test
	public void testDao(){
	}
	
	@After
	public void testAfter(){
		System.out.println("after.........................");
	}
}
