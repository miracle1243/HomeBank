package yao.homebank.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import yao.homebank.entity.Payments;
import yao.homebank.mapper.PaymentsMapper;

@Repository
public class PaymentsDaoImpl implements PaymentsDao {
	@Resource
	private PaymentsMapper mapper;

	@Override
	public List<Payments> query(Map<String, Object> filter, int start, int rows) {
		// TODO Auto-generated method stub
		RowBounds rb = new RowBounds(start, rows);

		return this.mapper.queryPage(filter, rb);
	}

	@Override
	public int getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.mapper.getTotal(map);
	}

	@Override
	public void addPayments(Payments model) {
		this.mapper.addPayments(model);

	}

	@Override
	public void delPayments(String id) {
		this.mapper.delPayments(id);

	}

	@Override
	public Payments getPaymentsById(String id) {
		return this.mapper.getPaymentsById(id);
	}

	@Override
	public void updatePayments(Payments model) {
		this.mapper.updatePayments(model);

	}
}
