package com.gudlike.fishing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gudlike.fishing.controller.BaseController;
import com.gudlike.fishing.model.Point;
import com.gudlike.fishing.service.PointService;


@Controller
@RequestMapping("")
public class IndexController extends BaseController{

	
	@Autowired
	private PointService pointService;
	
	@RequestMapping("")
	protected String index() {
		System.out.println(pointService.getPointListInRange());
		return "index";
	}
}
