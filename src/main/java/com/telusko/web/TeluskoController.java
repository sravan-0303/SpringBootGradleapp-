package com.telusko.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoController 
{
	@GetMapping("/")
	public String getInfo()
	{
		return "Gradle Telusko App";
	}

}
