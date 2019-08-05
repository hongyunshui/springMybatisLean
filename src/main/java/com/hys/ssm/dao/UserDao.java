package com.hys.ssm.dao;

import com.hys.ssm.po.User;

/**
 * 描述：dao接口，用户管理
 * @author hys
 *
 */
public interface UserDao {
	// 根据id查询用户
	public User findUserById(int id) throws Exception;
	
}
