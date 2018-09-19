package com.example.demo.controller;

import java.util.Optional;

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
	
	@RequestMapping(value= {"/challenge/","challenge/{name}"})
	public String challengePage(@PathVariable Optional<String> name, Model model) {
		if (name.isPresent()) {
			model.addAttribute("name", name.get());
		}
		else {
			model.addAttribute("name",  "KB");
		}
		return "challenge";
	}
	
	@RequestMapping("/generator")
	public String generator(@RequestParam(value = "a") String jmlM, @RequestParam(value = "b") String jmlHm, Model model) {
		String hm = "hm";
		
		if (jmlM.equals("0") || jmlM.equals("1")) {
		}
		else {
			for (int i = 1; i < Integer.parseInt(jmlM); i++) {
				hm += "m";
			}
		}
		
		if (jmlHm.equals("0") || jmlHm.equals("1")) {
			
		}
		else {
			String hmNew = hm;
			for (int i = 1; i < Integer.parseInt(jmlHm); i++) {
				hm += " " + hmNew;
			}
		}
		model.addAttribute("jmlM", jmlM);
		model.addAttribute("jmlHm", jmlHm);
		model.addAttribute("hm", hm);
		return "generator";
	}
	
}
