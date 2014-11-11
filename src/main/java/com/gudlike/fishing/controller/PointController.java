package com.gudlike.fishing.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gudlike.fishing.controller.BaseController;
import com.gudlike.fishing.model.JsonResult;
import com.gudlike.fishing.model.Point;
import com.gudlike.fishing.service.PointFishService;
import com.gudlike.fishing.service.PointService;

@Controller
@RequestMapping("/point")
public class PointController extends BaseController {

	/**
	 * 自动注入的PointService
	 */
	@Autowired
	private PointService pointService;
	/**
	 * 自动注入的PointFishService
	 */
	@Autowired
	private PointFishService pointFishService;

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

	/**
	 * 添加渔点
	 * 
	 * @param point
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	protected JsonResult addPost(@ModelAttribute Point point,
			HttpServletRequest request) {
		if (pointService.insertPoint(point, request.getParameter("fishIds"))) {
			return JsonResult.OK;
		} else {
			return JsonResult.FAIL;
		}
	}
}
