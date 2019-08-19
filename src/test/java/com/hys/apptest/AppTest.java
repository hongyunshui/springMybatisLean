package com.hys.apptest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hys.ssm.mapper.UserMapper;
import com.hys.ssm.po.User;

public class AppTest {

	private ApplicationContext applicationContext;

	/**
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception{
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserById(10);
		if(user != null){
			System.out.println(user.getUsername());
		}else {
			System.out.println("未查询到用户信息");
		}
		
	}

}
