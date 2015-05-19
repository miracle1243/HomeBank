package yao.homebank.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yao.homebank.entity.User;
import yao.homebank.service.UserService;


@Controller
@RequestMapping("/userController")
public class UserController {
	@Resource
	private UserService service;
	
	
	@RequestMapping("/list.do")
	@ResponseBody
	public Object list(Model model) {
		List<User> list = service.getAllUser();
		return list;
	}
}
