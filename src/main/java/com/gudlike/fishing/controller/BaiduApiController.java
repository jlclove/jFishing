package com.gudlike.fishing.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gudlike.fishing.common.Configuration;
import com.gudlike.fishing.model.JsonResult;
import com.gudlike.tools.utils.HttpClientUtil;
import com.gudlike.tools.utils.TextUtil;

@Controller
@RequestMapping("/baidu")
public class BaiduApiController {

	@RequestMapping("/location/ip")
	protected void index(HttpServletResponse response) {
		try {
			response.getWriter().print(HttpClientUtil.doGet(TextUtil
					.format(Configuration.getInstance().getBaiduMapIpLocation(),
							Configuration.getInstance().getBaiduMapAk())));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
