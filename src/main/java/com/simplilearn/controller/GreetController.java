package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/account/status/")
	public String statusCheck() {
		return "account-ms is up and running..";
	}
}
