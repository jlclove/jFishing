package com.gudlike.fishing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gudlike.fishing.model.Point;
import com.gudlike.fishing.model.PointViewWithType;

@Service
public class PointService extends BaseService<Point> {

	/**
	 * 获得渔点列表
	 * @return
	 */
	public List<Point> getListInRange() {
		return this.selectList("queryListInRange");
	}
}
