package yao.homebank.dao;

import java.util.List;
import java.util.Map;

import yao.homebank.entity.Buget;

public interface BugetDao
{
  public Buget getBuget(String month);
  List<Buget> query(Map<String, Object> filter, int start, int rows);

  int getTotal(Map<String, Object> map);
  public void addBuget(Buget model);
  public void deleteBuget(String id);
}
