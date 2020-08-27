package com.example.demodeploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CotrollerNe {
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
}
