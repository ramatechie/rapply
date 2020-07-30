package com.ramatechie.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PhoneController {

	@RequestMapping("/call")
	public String getCall() {
		return " Hello, Who is dis ?";
	}
}
