package yao.homebank.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import yao.homebank.entity.Menu;
import yao.homebank.mapper.CommonMapper;

@Repository
public class CommonDaoImpl implements CommonDao {
	@Resource
	private CommonMapper mapper;

	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return this.mapper.getAllMenu();
	}

}
