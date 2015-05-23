package yao.homebank.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yao.homebank.entity.Menu;
import yao.homebank.service.CommonService;
import yao.homebank.utils.MenuUtils;

@Controller
public class HomePageController {
	@Resource
	private CommonService commonService;
	
	@RequestMapping("/home.do")
	public String foword(Model model) {
		List<Menu> list = this.commonService.getAllMenu();
		String menus = MenuUtils.buildMenus(list);
		model.addAttribute("menus", menus);
		return "index";
	}
}
