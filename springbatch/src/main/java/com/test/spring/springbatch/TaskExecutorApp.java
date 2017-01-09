package com.test.spring.springbatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class TaskExecutorApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springbatch.xml");
		TaskExecutorExample taskExecutorApp=(TaskExecutorExample)applicationContext.getBean("taskExecutorExample");
		taskExecutorApp.printMessages();
	}
}
