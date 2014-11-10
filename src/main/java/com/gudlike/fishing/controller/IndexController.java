package com.gudlike.fishing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gudlike.fishing.controller.BaseController;
import com.gudlike.fishing.service.FishService;

@Controller
@RequestMapping("")
public class IndexController extends BaseController {

	/**
	 * 自动注入的 FishService
	 */
	@Autowired
	private FishService fishService;

	@RequestMapping("")
	protected String index(Model model) {
		model.addAttribute("fishList", fishService.getList());
		return "index";
	}

}
