package com.gudlike.fishing.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

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
	private int pointType;
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
	 * 获得 pointType int
	 * @return pointType
	 */
	public int getPointType() {
		return pointType;
	}
	/**
	 * 设置 pointType
	 * @param pointType 
	 */
	public void setPointType(int pointType) {
		this.pointType = pointType;
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
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [id=" + id + ", pointType=" + pointType + ", remark="
				+ remark + ", createTime=" + createTime + ", creator="
				+ creator + ", updateTime=" + updateTime + ", updator="
				+ updator + "]";
	}
	
}
