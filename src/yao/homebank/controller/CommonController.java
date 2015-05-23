package yao.homebank.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import yao.homebank.entity.DataDict;
import yao.homebank.service.CommonService;

@Controller
@RequestMapping("commonController")
public class CommonController {
	@Resource
	private CommonService service;
	
	@RequestMapping("/listDatadict.do")
	@ResponseBody
	public Object getDatadictList(Model model) {
		return this.service.getDatadictList();
	}
	
	@RequestMapping("/listDatadictCata.do")
	@ResponseBody
	public Object getDatadictCataList(@RequestParam String catalog) {
		return this.service.getDatadictCataList(catalog);
	}
	
	@RequestMapping("/addDatadictData.do")
	@ResponseBody
	public Object addDatadictData(DataDict model) {
		this.service.addDatadictData(model);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "true");
		map.put("msg", "��ӳɹ�!");
		return map;
	}
	
	@RequestMapping("/deleteDatadictData.do")
	@ResponseBody
	public Object delDatadictData(@RequestParam String id){
		this.service.delDatadictData(id);
		Map<String, String> map = new HashMap<String, String>();
		map.put("success", "true");
		map.put("msg", "ɾ���ɹ�!");
		return map;
	}
	
	@RequestMapping("/preUpdateDatadictData.do")
	public String preUpdateDatadictData(@RequestParam String id, Model model) {
		DataDict data = this.service.getDatadictDataById(id);
		model.addAttribute("entity", data);
		
		return "/preupdatedatadictdata";
	}
	
	@RequestMapping("/updateDatadictData.do")
	@ResponseBody
	public Object updateDatadictData(DataDict model) {
	    this.service.updateDatadictData(model);
	    Map<String,String> map = new HashMap<String,String>();
	    map.put("success", "true");
	    map.put("msg", "�޸ĳɹ���");
	    return map;
	}
	
}

















