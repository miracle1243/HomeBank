package yao.homebank.service;

import java.util.Map;

import yao.homebank.entity.Buget;
import yao.homebank.model.Page;

public interface BugetService
{
  public Buget getBuget(String month);

  public Page query(Map<String, Object> filter);

  public void addBuget(Buget model);

  public void deleteBuget(String id);
}
