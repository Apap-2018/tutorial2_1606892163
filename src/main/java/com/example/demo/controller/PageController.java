package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
	@RequestMapping("/viral") // menerima pemanggilan alamat dengan akhiran "/viral"
	public String index() {
		return "viral"; // memanggil file html dengan nama sesuai return tsb
	}
}
