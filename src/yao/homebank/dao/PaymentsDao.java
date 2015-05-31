package yao.homebank.dao;

import java.util.List;
import java.util.Map;

import yao.homebank.entity.Payments;

public interface PaymentsDao {

	public List<Payments> query(Map<String, Object> filter, int start, int rows);
	
	public int getTotal(Map<String, Object> map);
	
	public void addPayments(Payments model);

	public void delPayments(String id);

	public Payments getPaymentsById(String id);

	public void updatePayments(Payments model);
	
}
