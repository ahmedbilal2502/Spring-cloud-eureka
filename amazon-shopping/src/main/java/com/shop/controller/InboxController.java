package com.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class InboxController {

	private RestTemplate restTemplate;

	public InboxController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping("/")
	public String getInfo() {
		String url = "http://PAYMENT-SERVICE/";
		
		return restTemplate.getForObject(url, String.class);
	}
}
