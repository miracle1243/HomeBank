package yao.homebank.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import yao.homebank.dao.PaymentsDao;
import yao.homebank.entity.Payments;
import yao.homebank.model.Page;

@Service
public class PaymentsServiceImpl implements PaymentsService {
	@Resource
	 private PaymentsDao dao;

	@Override
	public Page query(Map<String, Object> filter) {
		// TODO Auto-generated method stub
		int pageno = Integer.parseInt(filter.get("page").toString());
		int rows = Integer.parseInt(filter.get("rows").toString());
		int start = (pageno - 1) * rows;
		
		filter.remove("page");
		filter.remove("rows");
		
		Map<String, Object> map = new HashMap<String, Object>();
		for (String o : filter.keySet()) {
			if (filter.get(o) == null || filter.get(o).equals("")){
				continue;
			}
			map.put(o, filter.get(o));
		}
		
		List<Payments> list = this.dao.query(filter, start, rows);
		int total = this.dao.getTotal(map);
		Page page = new Page();
		page.setRows(list);
		page.setTotal(total);
		
		return page;
	}

	@Override
	public void addPayments(Payments model) {
		model.setCrttime(new Date());
		model.setDay(model.getDay().replaceAll("-", ""));
		this.dao.addPayments(model);
	}

	@Override
	public void delPayments(String id) {
		this.dao.delPayments(id);
		
	}

	@Override
	public Payments getPaymentsById(String id) {
		// TODO Auto-generated method stub
		return this.dao.getPaymentsById(id);
	}

	@Override
	public void updatePayments(Payments model) {
		// TODO Auto-generated method stub
		this.dao.updatePayments(model);
	}

}
