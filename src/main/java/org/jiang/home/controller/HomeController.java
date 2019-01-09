package org.jiang.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/home/index")
	public String home() {
		System.out.println("welcome to home!");
		return "index";
	}
}
