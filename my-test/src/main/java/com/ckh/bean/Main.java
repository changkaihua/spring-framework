package com.ckh.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ckh
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
		User user = (User) ac.getBean("user");
		System.out.println(user);

	}
}
