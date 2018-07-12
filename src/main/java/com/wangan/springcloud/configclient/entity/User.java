package com.wangan.springcloud.configclient.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangan on 2018/7/12
 * @description
 */
 @ConfigurationProperties(prefix = "wangan.cloud.user")
public class User {

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
