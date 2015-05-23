package yao.homebank.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import yao.homebank.dao.CommonDao;
import yao.homebank.entity.Menu;

@Service
public class CommonServiceImpl implements CommonService {
	@Resource
	private CommonDao dao;
	
	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return this.dao.getAllMenu();
	}

}
