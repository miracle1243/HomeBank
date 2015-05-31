package yao.homebank.service;

import java.util.Map;

import yao.homebank.entity.Payments;
import yao.homebank.model.Page;

public interface PaymentsService {

	public Page query(Map<String, Object> filter);
	
	public void addPayments(Payments model);
	
	public void delPayments(String id);
	
	public Payments getPaymentsById(String id);
	
	public void updatePayments(Payments model);
	
}
