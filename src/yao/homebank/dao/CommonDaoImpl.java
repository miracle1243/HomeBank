package yao.homebank.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import yao.homebank.entity.DataDict;
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

	@Override
	public List<DataDict> getDatadictList() {
		// TODO Auto-generated method stub
		return this.mapper.getDatadictList();
	}

	@Override
	public List<DataDict> getDatadictCataList(String catalog) {
		// TODO Auto-generated method stub
		return this.mapper.getDatadictCataList(catalog);
	}

	@Override
	public void addDatadictData(DataDict model) {
		// TODO Auto-generated method stub
		this.mapper.addDatadictData(model);
	}

	@Override
	public void delDatadictData(String id) {
		// TODO Auto-generated method stub
		this.mapper.delDatadictData(id);
	}

	@Override
	public DataDict getDatadictDataById(String id) {
		// TODO Auto-generated method stub
		return this.mapper.getDatadictDataById(id);
	}

	@Override
	public void updateDatadictData(DataDict model) {
		// TODO Auto-generated method stub
		this.mapper.updateDatadictData(model);
	}

	@Override
	public Integer getWeekSum(Map<String, String> map) {
		// TODO Auto-generated method stub
		return this.mapper.getWeekSum(map);
	}

	@Override
	public Integer getMonthSum(Map<String, String> map) {
		// TODO Auto-generated method stub
		return this.mapper.getMonthSum(map);
	}

	@Override
	public List<Map> getMonthSumByType(String month) {
		// TODO Auto-generated method stub
		return this.mapper.getMonthSumByType(month);
	}

	@Override
	public Integer getDayValue(String day) {
		// TODO Auto-generated method stub
		return this.mapper.getDayValue(day);
	}

}
