package com.spring.pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizza")
public class HomeController {

	public String redirectToFlow() {
		return "redirect:/pizza"; 
	}
	
}
