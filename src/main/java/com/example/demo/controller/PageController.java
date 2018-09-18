package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
	@RequestMapping("/viral") // menerima pemanggilan alamat dengan akhiran "/viral"
	public String index() {
		return "viral"; // memanggil file html dengan nama sesuai return tsb
	}
	
	@RequestMapping("/challenge")
	public String challenge(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("name", name);
		return "challenge";
	}
	
	@RequestMapping("/challenge/{name}")
	public String challengePage(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "challenge";
	}
}
