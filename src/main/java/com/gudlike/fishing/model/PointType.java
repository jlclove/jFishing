package com.gudlike.fishing.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("pointType")
public class PointType implements Serializable{
	private static final long serialVersionUID = -5458523946133119541L;
	/**
	 * id
	 */
	private int id;
	/**
	 * 类型名称
	 */
	private String typeName;
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
	 * 获得 typeName String
	 * @return typeName
	 */
	public String getTypeName() {
		return typeName;
	}
	/**
	 * 设置 typeName
	 * @param typeName 
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PointType [id=" + id + ", typeName=" + typeName + "]";
	}
}
