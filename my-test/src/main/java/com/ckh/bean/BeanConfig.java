package com.ckh.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ckh
 * @version 1.0
 */
@Configuration
@ComponentScan
public class BeanConfig {
	@Bean
	public User user() {
		return new User(101, "joe", "pwd", "13995978321", "china");
	}
}
