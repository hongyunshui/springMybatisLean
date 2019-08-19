package com.hys.ssm.dao.imp;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hys.ssm.dao.UserDao;
import com.hys.ssm.po.User;

public class UserDaoImpTest {
	
	private ApplicationContext applicationContext;

	/**
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception{
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	/**
	 * 原始dao开发测试
	 * @throws Exception
	 */
	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(0);
		if(user != null){
			System.out.println(user.getUsername());
		}else {
			System.out.println("未查到用户");
		}
		
	}

}
