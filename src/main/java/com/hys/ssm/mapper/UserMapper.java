package com.hys.ssm.mapper;

import java.util.List;

import com.hys.ssm.po.User;

/**
 * 描述：mapper接口，用户管理
 * @author hys
 *
 */
public interface UserMapper {
	
	// 根据id查询用户
	public User findUserById(int id) throws Exception;
	
	// 根据姓名查询用户
	public List<User> findUsersByName(String name) throws Exception;

}
