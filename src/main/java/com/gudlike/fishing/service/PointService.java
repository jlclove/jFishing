/**
 * 
 */
package com.gudlike.fishing.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.gudlike.fishing.model.Point;

/**
 * 渔点service
 * @author jail
 *
 * @date 2014年10月30日
 */
@Service
public class PointService extends BaseService<Point>{
	/**
	 * 获得 范围内的渔点
	 * @return List<Point>
	 */
	public List<Point> getPointListInRange(double startLatitude,double endLatitude,double startLongitude,double endLongitude){
		Map<String,Double> map = new HashMap<String, Double>();
		map.put("startLatitude", startLatitude);
		map.put("endLatitude", endLatitude);
		map.put("startLongitude", startLongitude);
		map.put("endLongitude", endLongitude);
		return this.selectList("queryListInRange",map);
	}
}
