package com.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InboxController {

	@GetMapping("/")
	public String getInfo() {
		return "Inbox Controller Payment Service";
	}
}
