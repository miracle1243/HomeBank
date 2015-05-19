package yao.homebank.mapper;

import java.util.List;

import yao.homebank.entity.User;

public interface UserMapper extends BaseMapper {
	public List<User> getAllUser();  
}
