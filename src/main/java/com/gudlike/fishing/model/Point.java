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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [id=" + id + ", typeId=" + typeId + ", remark="
				+ remark + ", createTime=" + createTime + ", creator="
				+ creator + ", updateTime=" + updateTime + ", updator="
				+ updator + "]";
	}
}
