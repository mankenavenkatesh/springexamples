package com.test.spring.springbatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskSchedulerApp {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("springbatch.xml");
	}
}
