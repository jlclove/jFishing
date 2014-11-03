package com.gudlike.fishing.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;


/**
 * 鱼 类
 * @author jail
 *
 * @date 2014年10月30日
 */
@Alias("fish")
public class Fish implements Serializable{

	private static final long serialVersionUID = -5312258393626178322L;
	/**
	 * id
	 */
	private int id;
	/**
	 * 鱼的名称
	 */
	private String fishName;
	/**
	 * 鱼的介绍
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置 id int
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得 fishName String
	 * @return the fishName
	 */
	public String getFishName() {
		return fishName;
	}
	/**
	 * 设置 fishName String
	 * @param fishName the fishName to set
	 */
	public void setFishName(String fishName) {
		this.fishName = fishName;
	}
	/**
	 * 获得 remark String
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置 remark String
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获得 createTime Date
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置 createTime Date
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获得 creator int
	 * @return the creator
	 */
	public int getCreator() {
		return creator;
	}
	/**
	 * 设置 creator int
	 * @param creator the creator to set
	 */
	public void setCreator(int creator) {
		this.creator = creator;
	}
	/**
	 * 获得 updateTime Date
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置 updateTime Date
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获得 updator Integer
	 * @return the updator
	 */
	public Integer getUpdator() {
		return updator;
	}
	/**
	 * 设置 updator Integer
	 * @param updator the updator to set
	 */
	public void setUpdator(Integer updator) {
		this.updator = updator;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fish [id=" + id + ", fishName=" + fishName + ", remark="
				+ remark + ", createTime=" + createTime + ", creator="
				+ creator + ", updateTime=" + updateTime + ", updator="
				+ updator + "]";
	}
}
