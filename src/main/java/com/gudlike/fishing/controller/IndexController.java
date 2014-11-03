package com.gudlike.fishing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gudlike.fishing.controller.BaseController;


@Controller
@RequestMapping("")
public class IndexController extends BaseController{

	
	
	@RequestMapping("")
	protected String index() {
		return "index";
	}
	
}
