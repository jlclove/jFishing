package com.gudlike.fishing.common;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class AppConfigurer extends PropertyPlaceholderConfigurer {

	/**
	 * 系统版本号
	 */
	private String version;
	/**
	 * 系统环境
	 */
	private String env;

	@Override
	protected Properties mergeProperties() throws IOException {
		// TODO Auto-generated method stub
		Properties properties = super.mergeProperties();
		this.setEnv(properties.getProperty("env"));
		this.setVersion(properties.getProperty("version"));
		return properties;
	}

	public static AppConfigurer getInstance() {
		WebApplicationContext wac = ContextLoader
				.getCurrentWebApplicationContext();
		return (AppConfigurer) wac.getBean("appConfigurer");
	}

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
}
