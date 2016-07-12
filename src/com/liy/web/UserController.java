/**
 * 
 */
package com.liy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.liy.po.User;
import com.liy.service.UserService;

/**
 * @author ly  @date 2014-11-10
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		
		return "login";
	}
	@RequestMapping("/toRegister")
	public String toRegister(Model model) {
		model.addAttribute(new User());
		return "register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(User user2,BindingResult result) {
		if (result.hasErrors()) {
			return "user/register";
		}
		userService.registerUser(user2);
		return "redirect:/home/"+user2.getUserName();
	}
}
