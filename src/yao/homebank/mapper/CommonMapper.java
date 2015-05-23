package yao.homebank.mapper;

import java.util.List;

import yao.homebank.entity.Menu;

public interface CommonMapper extends BaseMapper {
	public List<Menu> getAllMenu();
}
