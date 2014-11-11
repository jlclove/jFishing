package com.gudlike.fishing.model;

import java.io.Serializable;
import org.apache.ibatis.type.Alias;

/**
 * 鱼 与 渔点关系 类
 * 
 * @author jail
 *
 * @date 2014年10月30日
 */
@Alias("pointFish")
public class PointFish implements Serializable {
	private static final long serialVersionUID = -6175958471179126649L;
	/**
	 * id
	 */
	private int id;
	/**
	 * 鱼ID
	 */
	private int fishId;
	/**
	 * 渔点ID
	 */
	private int pointId;

	/**
	 * 获得 id int
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置 id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 获得 fishId String
	 * 
	 * @return fishId
	 */
	public int getFishId() {
		return fishId;
	}

	/**
	 * 设置 fishId
	 * 
	 * @param fishId
	 */
	public void setFishId(int fishId) {
		this.fishId = fishId;
	}

	/**
	 * 获得 pointId String
	 * 
	 * @return pointId
	 */
	public int getPointId() {
		return pointId;
	}

	/**
	 * 设置 pointId
	 * 
	 * @param pointId
	 */
	public void setPointId(int pointId) {
		this.pointId = pointId;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PointFish [id=" + id + ", fishId=" + fishId + ", pointId="
				+ pointId + "]";
	}

	public PointFish() {
	}

	public PointFish(int pointId, int fishId) {
		this.pointId = pointId;
		this.fishId = fishId;
	}
}
