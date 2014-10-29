package com.gudlike.fishing.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.gudlike.fishing.common.Configuration;

public class BaseController {

	@ModelAttribute("config")
	protected Configuration setConfig() {
		return Configuration.getInstance();
	}
}
