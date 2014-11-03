package com.gudlike.fishing.model;

import org.apache.ibatis.type.Alias;

@Alias("pointViewWithType")
public class PointViewWithType extends Point{

	private static final long serialVersionUID = -6789914626848315878L;
	
	/**
	 * 分类名称
	 */
	private String typeName;

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
		return "PointViewWithType [typeName=" + typeName + "]";
	}
}
