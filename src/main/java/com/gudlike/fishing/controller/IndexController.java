package com.gudlike.fishing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class IndexController extends BaseController{

	@RequestMapping("")
	protected String index() {
		return "index";
	}
}
