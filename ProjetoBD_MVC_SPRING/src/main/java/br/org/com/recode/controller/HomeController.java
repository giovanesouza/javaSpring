package br.org.com.recode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@GetMapping("/")
public class HomeController {

	public String index() {
		return "index.html";
		}

	
}
