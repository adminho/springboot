package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	//http://localhost:8080/
	@GetMapping("/submit")
	public String greeting(@RequestParam String fname, @RequestParam String lname, Model model) {
	//public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {	
		model.addAttribute("fname", fname);
		model.addAttribute("lname", lname);
		return "result";
	}

}