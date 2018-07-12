package com.wangan.springcloud.configclient.config;


import com.wangan.springcloud.configclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangan on 2018/7/12
 * @description
 */
@EnableConfigurationProperties(User.class)
@RestController
public class WanganConfiguration {

	private final User user;

	@Autowired
	public WanganConfiguration(User user) {
		this.user = user;
	}

//	@Bean
//	public User getUser(){
//		System.out.println("user create");
//		return user;
//	}

	@GetMapping("/user")
	public User user() {
		return user;
	}
}
