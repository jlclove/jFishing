/**
 * 
 */
package com.gudlike.fishing.model;

import org.apache.ibatis.type.Alias;

/**
 * 鱼点 视图类
 * @author jail
 *
 * @date 2014年10月30日
 */
@Alias("pointWithType")
public class PointWithType extends Point{

	private static final long serialVersionUID = 4549451095098166915L;
	
	/**
	 * 渔点名称
	 */
	private String typeName;

	/**
	 * 获得 typeName String
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
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
		return "VPoint [typeName=" + typeName + "]";
	}
}
