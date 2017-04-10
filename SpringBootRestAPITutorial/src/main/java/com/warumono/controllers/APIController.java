package com.warumono.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController
{
	@GetMapping(value = "ping")
	public String pingpong()
	{
		return "pong";
	}
}
