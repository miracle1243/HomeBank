package yao.homebank.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import yao.homebank.entity.Payments;
import yao.homebank.service.PaymentsService;

@Controller
@RequestMapping("paymentsController")
public class PaymentsController {

	@Resource
	private PaymentsService service;

	@RequestMapping("/query.do")
	@ResponseBody
	public Object query(@RequestParam Map<String, Object> filter) {
		return this.service.query(filter);
	}

	@RequestMapping("/addPayments.do")
	@ResponseBody
	public Object addPayments(Payments model) {
		this.service.addPayments(model);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "true");
		map.put("msg", "添加成功！");
		return map;
	}

	@RequestMapping("deletePayments.do")
	@ResponseBody
	public Object deletePayments(@RequestParam String id) {
		this.service.delPayments(id);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "true");
		map.put("msg", "删除成功！");
		return map;
	}

	@RequestMapping("/preUpdatePayments.do")
	public Object preUpdatePayments(@RequestParam String id, Model model) {
		Payments data = this.service.getPaymentsById(id);
		model.addAttribute("entity", data);
		if (data.getPaymenttype().equals("2"))
			return "/preupdatepayments";
		else
			return "/preupdateincome";
	}

	@RequestMapping("/updatePayments.do")
	@ResponseBody
	public Object updatePayments(Payments model) {
		this.service.updatePayments(model);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "true");
		map.put("msg", "修改成功！");
		return map;
	}
}
