package com.syc.ssm.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.syc.ssm.controller.RestFulController;



@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  测试controll不建议。因为，controller不建议写业务逻辑。单元测试做到service即可，所以也不用深究
@ContextConfiguration(locations={"classpath*:spring/spring-context.xml"})
public class ControllerTest {
	private MockMvc mockMvcLogin;
	
	@Autowired
	private RestFulController restFulController;
	
	@Before
	public void setUp() throws Exception{
		mockMvcLogin = MockMvcBuilders.standaloneSetup(restFulController).build();
		
	}
	
	@Test
	public void testGetUsers() throws Exception{
		ResultActions result = mockMvcLogin.perform(MockMvcRequestBuilders.get("/sayHello"));
				//.param("loginName", "admin").param("password", "1qaz1qaz"));
		String resStr = result.andReturn().getResponse().getContentAsString();
		System.out.println(resStr);
	}
}