package yao.homebank.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import yao.homebank.entity.User;
import yao.homebank.mapper.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {
	@Resource
	private UserMapper mapper;
	
	@Override
	public List<User> getAllUser() {
		return this.mapper.getAllUser();
	}
	
}
