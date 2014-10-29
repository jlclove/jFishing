package com.gudlike.fishing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/baidu")
public class BaiduApiController {

	@RequestMapping("/location/ip")
	protected String index() {
		return "index";
	}
}
