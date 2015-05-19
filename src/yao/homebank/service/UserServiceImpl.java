package yao.homebank.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import yao.homebank.dao.UserDao;
import yao.homebank.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao dao;
	
	@Override
	public List<User> getAllUser() {
		return this.dao.getAllUser();
	}
	
}
