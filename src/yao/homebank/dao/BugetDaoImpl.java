package yao.homebank.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import yao.homebank.entity.Buget;
import yao.homebank.mapper.BugetMapper;

@Repository
public class BugetDaoImpl implements BugetDao
{
  @Resource
  BugetMapper mapper;

  @Override
  public Buget getBuget(String month)
  {
    return this.mapper.getBugetByMonth(month);
  }

  @Override
  public List<Buget> query(Map<String, Object> filter, int start, int rows)
  {
    RowBounds rb = new RowBounds(start,rows);
    return this.mapper.queryPage(filter,rb);
  }

  @Override
  public int getTotal(Map<String, Object> map)
  {
    return this.mapper.getTotal(map);
  }

  @Override
  public void addBuget(Buget model)
  {
    this.mapper.addBuget(model);
    
  }

  @Override
  public void deleteBuget(String id)
  {
    this.mapper.deleteBuget(id);
    
  }
}
