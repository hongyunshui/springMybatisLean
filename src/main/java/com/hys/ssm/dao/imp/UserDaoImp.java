package com.hys.ssm.dao.imp;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hys.ssm.dao.UserDao;
import com.hys.ssm.po.User;

/**
 * UserDao的接口实现类
 * @author hys
 *
 */
public class UserDaoImp extends SqlSessionDaoSupport implements UserDao {

	// 通过id进行select
	public User findUserById(int id) throws Exception {
		
		// 继承SqlSessionDaoSupport，通过this.getSqlSession()获得sqlSession
		SqlSession sqlSession = this.getSqlSession();
		// 通过SqlSession 操作数据库
		// 第一个参数:映射文件中statement的id，等于namespace+statement的id
		// 第二个参数:指定和映射文件中匹配的parameteType类型的参数
		//selSession.selectOne结果是与映射文件中所匹配的resultType类型的对象
		// selectOne查询出一条记录
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}

}
