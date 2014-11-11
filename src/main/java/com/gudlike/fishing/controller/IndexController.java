package com.gudlike.fishing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gudlike.fishing.controller.BaseController;
import com.gudlike.fishing.service.FishService;
import com.gudlike.fishing.service.PointTypeService;

@Controller
@RequestMapping("")
public class IndexController extends BaseController {

	/**
	 * 自动注入的 FishService
	 */
	@Autowired
	private FishService fishService;

	/**
	 * 自动注入的 PointTypeService
	 */
	@Autowired
	private PointTypeService pointTypeService;

	@RequestMapping("")
	protected String index(Model model) {
		model.addAttribute("fishList", fishService.getList());
		model.addAttribute("pointTypeList", pointTypeService.getList());
		return "index";
	}

	@RequestMapping("test")
	protected String test(){
		return "/point/test";
	}
}
