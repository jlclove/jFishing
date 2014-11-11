package com.gudlike.fishing.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;


/**
 * 鱼点
 * @author jail
 *
 * @date 2014年10月30日
 */
@Alias("point")
public class Point implements Serializable {

	private static final long serialVersionUID = 8904331085492371279L;

	/**
	 * id
	 */
	private int id;
	/**
	 * 渔点类型
	 */
	private int typeId;
	/**
	 * 渔点
	 */
	private String remark;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建人
	 */
	private int creator;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新人
	 */
	private Integer updator;
	/**
	 * 纬度
	 */
	private Double latitude;
	/**
	 * 经度
	 */
	private Double longitude;
	/**
	 * 钓鱼水深
	 */
	private int waterDeep;
	/**
	 * 钓鱼费用
	 */
	private int price;
	/**
	 * 钓鱼费用单位
	 */
	private String unit;
	/**
	 * 是否可以夜钓
	 */
	private boolean nightFish;
	/**
	 * 是否方便停车
	 */
	private boolean easyPark;
	
	/**
	 * 渔点能钓的鱼名集合
	 */
	private String fishNames;
	/**
	 * 获得 id int
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置 id
	 * @param id 
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得 typeId int
	 * @return typeId
	 */
	public int getTypeId() {
		return typeId;
	}
	/**
	 * 设置 typeId
	 * @param typeId 
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获得 remark String
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置 remark
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获得 createTime Date
	 * @return createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置 createTime
	 * @param createTime 
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获得 creator int
	 * @return creator
	 */
	public int getCreator() {
		return creator;
	}
	/**
	 * 设置 creator
	 * @param creator 
	 */
	public void setCreator(int creator) {
		this.creator = creator;
	}
	/**
	 * 获得 updateTime Date
	 * @return updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置 updateTime
	 * @param updateTime 
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获得 updator Integer
	 * @return updator
	 */
	public Integer getUpdator() {
		return updator;
	}
	/**
	 * 设置 updator
	 * @param updator 
	 */
	public void setUpdator(Integer updator) {
		this.updator = updator;
	}
	/**
	 * 获得 latitude Double
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * 设置 latitude Double
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获得 longitude Double
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * 设置 longitude Double
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获得 waterDeep
	 * @return the waterDeep
	 */
	public int getWaterDeep() {
		return waterDeep;
	}
	/**
	 * 设置 waterDeep
	 * @param waterDeep the waterDeep to set
	 */
	public void setWaterDeep(int waterDeep) {
		this.waterDeep = waterDeep;
	}
	/**
	 * 获得 price
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * 设置 price
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * 获得 unit
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置 unit
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获得 nightFish
	 * @return the nightFish
	 */
	public boolean isNightFish() {
		return nightFish;
	}
	/**
	 * 设置 nightFish
	 * @param nightFish the nightFish to set
	 */
	public void setNightFish(boolean nightFish) {
		this.nightFish = nightFish;
	}
	/**
	 * 获得 easyPark
	 * @return the easyPark
	 */
	public boolean isEasyPark() {
		return easyPark;
	}
	/**
	 * 设置 easyPark
	 * @param easyPark the easyPark to set
	 */
	public void setEasyPark(boolean easyPark) {
		this.easyPark = easyPark;
	}
	/**
	 * 获得 fishNames String
	 * @return fishNames
	 */
	public String getFishNames() {
		return fishNames;
	}
	/**
	 * 设置 fishNames
	 * @param fishNames 
	 */
	public void setFishNames(String fishNames) {
		this.fishNames = fishNames;
	}
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [id=" + id + ", typeId=" + typeId + ", remark=" + remark
				+ ", createTime=" + createTime + ", creator=" + creator
				+ ", updateTime=" + updateTime + ", updator=" + updator
				+ ", latitude=" + latitude + ", longitude=" + longitude
				+ ", waterDeep=" + waterDeep + ", price=" + price + ", unit="
				+ unit + ", nightFish=" + nightFish + ", easyPark=" + easyPark
				+ ", fishNames=" + fishNames + "]";
	}
}
