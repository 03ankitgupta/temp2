package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceController {
	
	@GetMapping("/test")
	public String getTest() {
		return "Test Hello World";
	}

}
