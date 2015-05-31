package yao.homebank.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import yao.homebank.entity.Payments;

public interface PaymentsMapper extends BaseMapper {
	
	public List<Payments> queryPage(Map<String, Object> filter, RowBounds rb);
	
	public int getTotal(Map<String, Object> map);
	
	public void addPayments(Payments model);
	
	public void delPayments(String id);
	
	public Payments getPaymentsById(String id);
	
	public void updatePayments(Payments model);
}
