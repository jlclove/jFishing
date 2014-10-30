/**
 * 
 */
package com.gudlike.fishing.service;

import java.util.List;

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
	public List<Point> getPointListInRange(){
		return this.selectList("queryPointListInRange");
	}
}
