package com.gudlike.fishing.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gudlike.fishing.model.PointFish;
import com.gudlike.tools.utils.StringUtil;

/**
 * 渔点类型service
 * 
 * @author jail
 *
 * @date 2014年11月11日
 */
@Service
public class PointFishService extends BaseService<PointFish> {

	/**
	 * 批量插入 渔点与鱼 的关系记录
	 * 
	 * @param pointId
	 *            渔点ID
	 * @param fishIds
	 *            鱼ID集合
	 * @return
	 */
	public boolean insertFishs(int pointId, String fishIds) {
		if (StringUtils.isBlank(fishIds)) {
			return true;
		}
		List<PointFish> pointFishList = new ArrayList<PointFish>();
		String[] fishIdArray = fishIds.split(",");
		for (String fishId : fishIdArray) {
			pointFishList.add(new PointFish(pointId, Integer.valueOf(fishId)));
		}
		return this.insert("batchInsert", pointFishList);
	}
}
