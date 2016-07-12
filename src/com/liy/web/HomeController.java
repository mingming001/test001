/**
 * 
 */
package com.liy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ly  @date 2014-11-6
 *
 */
@Controller
public class HomeController {
	@RequestMapping({"/","/home"})
	public String showHomePage() {
		return "home";
	}
}
