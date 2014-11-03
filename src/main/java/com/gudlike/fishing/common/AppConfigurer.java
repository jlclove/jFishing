package com.gudlike.fishing.common;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class AppConfigurer{

	/**
	 * 系统版本号
	 */
	private String version;
	/**
	 * 系统环境
	 */
	private String env;

	/**
	 * 获得 version String
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * 设置 version
	 * @param version 
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 获得 env String
	 * 
	 * @return env
	 */
	public String getEnv() {
		return env;
	}

	/**
	 * 设置 env
	 * 
	 * @param env
	 */
	public void setEnv(String env) {
		this.env = env;
	}
	
	
	/**
	 * 临时 单例变量
	 */
	private static AppConfigurer appConfigurer;

	/**
	 * 单例
	 * 
	 * @return
	 */
	public synchronized static AppConfigurer getInstance() {
		WebApplicationContext webApplicationContext = ContextLoader
				.getCurrentWebApplicationContext();
		if (webApplicationContext == null) {
			if (appConfigurer == null) {
				appConfigurer = new AppConfigurer();
				PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();
				propertiesConfiguration.setEncoding("utf-8");
				try {
					propertiesConfiguration.load("global.properties");
					appConfigurer.setEnv(propertiesConfiguration
							.getString("env"));
					appConfigurer.setVersion(propertiesConfiguration
							.getString("version"));
				} catch (ConfigurationException e) {
					e.printStackTrace();
				}
			}
			return appConfigurer;
		} else {
			return (AppConfigurer) webApplicationContext
					.getBean("appConfigurer");
		}
	}
}
