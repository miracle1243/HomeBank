package yao.homebank.service;

import java.util.List;
import java.util.Map;

import yao.homebank.entity.DataDict;
import yao.homebank.entity.Menu;

public interface CommonService {

	public List<DataDict> getDatadictList();
	public List<Menu> getAllMenu();
	public List<DataDict> getDatadictCataList(String catalog);
	public void addDatadictData(DataDict model);
	public void delDatadictData(String id);
	public DataDict getDatadictDataById(String id);
	public void updateDatadictData(DataDict model);
	public Integer getWeekSum(Map<String,String> map);
	public Integer getMonthSum(Map<String, String> map);
	public Map<String,String> getMonthSumByType(String month, int days);
	List<Map<String,String>> getPayincomeData(String stryear, String strmonth, String monday, String sunday);
}
