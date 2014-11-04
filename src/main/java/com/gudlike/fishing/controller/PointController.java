package com.gudlike.fishing.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gudlike.fishing.controller.BaseController;
import com.gudlike.fishing.model.JsonResult;
import com.gudlike.fishing.service.PointService;

@Controller
@RequestMapping("/point")
public class PointController extends BaseController {

	@Autowired
	private PointService pointService;

	@RequestMapping("/getPointListInRange")
	@ResponseBody
	protected JsonResult getPointListInRange(HttpServletRequest request) {
		return JsonResult.OK.put("result", pointService.getPointListInRange(
				Double.parseDouble(request.getParameter("startLatitude")),
				Double.parseDouble(request.getParameter("endLatitude")),
				Double.parseDouble(request.getParameter("startLongitude")),
				Double.parseDouble(request.getParameter("endLongitude"))));
	}

	@RequestMapping("/add")
	protected String add(HttpServletRequest request) {
		return "point/add";
	}

}
