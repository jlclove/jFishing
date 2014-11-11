package com.gudlike.fishing.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gudlike.fishing.model.Point;

/**
 * 渔点service
 * 
 * @author jail
 *
 * @date 2014年10月30日
 */
@Service
@Transactional
public class PointService extends BaseService<Point> {
	@Autowired
	private PointFishService pointFishService;

	/**
	 * 获得 范围内的渔点
	 * 
	 * @return List<Point>
	 */
	public List<Point> getPointListInRange(double startLatitude,
			double endLatitude, double startLongitude, double endLongitude) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("startLatitude", startLatitude);
		map.put("endLatitude", endLatitude);
		map.put("startLongitude", startLongitude);
		map.put("endLongitude", endLongitude);
		return this.selectList("queryListInRange", map);
	}

	/**
	 * 插入渔点
	 * 
	 * @param point
	 * @return int
	 */
	public int insertPointAndReturnId(Point point) {
		return this.insertAndReturnId("insertAndReturnId", point);
	}

	@Transactional
	public boolean insertPoint(Point point, String fishIds) {
		int pointId = this.insertPointAndReturnId(point);
		if (pointId > 0) {
			pointFishService.insertFishs(pointId, fishIds);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 根据ID获得渔点
	 * 
	 * @param id
	 * @return
	 */
	public Point getPoint(int id) {
		return this.selectOne("queryBean", id);
	}
}
