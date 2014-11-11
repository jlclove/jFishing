package com.gudlike.fishing.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.gudlike.fishing.model.Fish;

/**
 * 鱼service
 * 
 * @author jail
 *
 * @date 2014年10月30日
 */
@Service
public class FishService extends BaseService<Fish> {

	/**
	 * 获得鱼列表
	 * 
	 * @return List<Fish>
	 */
	public List<Fish> getList() {
		return this.selectList("queryList");
	}
}
