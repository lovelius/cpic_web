package com.chillax.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chillax.dao.IUserDao;
import com.chillax.dto.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	//private IUserService userService;
	private IUserDao userDao;
	
	@RequestMapping("/userList") //方法名注解
	public String userList(HttpServletRequest request,Model model){
		//List<User> uList = userService.getAllUser();
		List<User> uList = userDao.getAllUser();
		model.addAttribute("uList", uList);
		return "userList";
	}
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		//User user = userService.getUserById(userId);
		User user = userDao.queryByPrimaryKey(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/addUserUI") 
	public String addUserUI(){
		return "addUser";
	}
	
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request,Model model){
		User user = new User();
		user.setName(String.valueOf(request.getParameter("name")));
		user.setPassword(String.valueOf(request.getParameter("password")));
		user.setAge(Integer.parseInt(String.valueOf(request.getParameter("age"))));
		//userService.addUser(user);
		userDao.insertUser(user);
		return "redirect:/user/userList";
	}
}
