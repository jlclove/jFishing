package com.gudlike.fishing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gudlike.fishing.model.PointType;

/**
 * 渔点类型service
 * 
 * @author jail
 *
 * @date 2014年11月11日
 */
@Service
public class PointTypeService extends BaseService<PointType> {
	/**
	 * 获得渔点类型列表
	 * 
	 * @return List<PointType>
	 */
	public List<PointType> getList() {
		return this.selectList("queryList");
	}
}
