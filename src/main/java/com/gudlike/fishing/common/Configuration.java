package com.gudlike.fishing.common;

import java.io.Serializable;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * 基础配置类
 * 
 * @author Jail Hu
 *
 */
public class Configuration implements Serializable {
	private static final long serialVersionUID = -6538298430389982247L;

	private static Configuration configuration;

	/**
	 * 百度地图 ak
	 */
	private String baiduMapAk;
	/**
	 * 百度地图 ip Location 接口
	 */
	private String baiduMapIpLocation;

	/**
	 * 获得 baiduMapAk String
	 * 
	 * @return baiduMapAk
	 */
	public String getBaiduMapAk() {
		return baiduMapAk;
	}

	/**
	 * 设置 baiduMapAk
	 * 
	 * @param baiduMapAk
	 */
	public void setBaiduMapAk(String baiduMapAk) {
		this.baiduMapAk = baiduMapAk;
	}

	/**
	 * 获得 baiduMapIpLocation String
	 * 
	 * @return baiduMapIpLocation
	 */
	public String getBaiduMapIpLocation() {
		return baiduMapIpLocation;
	}

	/**
	 * 设置 baiduMapIpLocation
	 * 
	 * @param baiduMapIpLocation
	 */
	public void setBaiduMapIpLocation(String baiduMapIpLocation) {
		this.baiduMapIpLocation = baiduMapIpLocation;
	}

	/**
	 * 单例
	 * 
	 * @return
	 */
	public static synchronized Configuration getInstance() {
		if (configuration == null) {
			configuration = new Configuration();
			PropertiesConfiguration prop = new PropertiesConfiguration();
			prop.setEncoding("utf-8");
			try {
				prop.load(AppConfigurer.getInstance().getEnv()
						+ "_jFishing.properties");
				configuration.setBaiduMapAk(prop.getString("baiduMapAk"));
				configuration.setBaiduMapIpLocation(prop
						.getString("baiduMapIpLocation"));
			} catch (ConfigurationException e) {
				e.printStackTrace();
			}
		}
		return configuration;
	}

}
