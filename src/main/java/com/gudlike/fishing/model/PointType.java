package com.gudlike.fishing.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;


/**
 * 渔点类型
 * @author jail
 *
 * @date 2014年10月30日
 */
@Alias("pointType")
public class PointType implements Serializable{

	private static final long serialVersionUID = 3464224246263790914L;
	/**
	 * id
	 */
	private int id;
	/**
	 * 类型名
	 */
	private String typeName;
	/**
	 * 设置 id int
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 设置 typeName String
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PointType [id=" + id + ", typeName=" + typeName + "]";
	}
}
