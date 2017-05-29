package com.example.jmssender;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestJmsSender {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationContext.xml");
		ctx.refresh();
		
		MyMessageSender sender = ctx.getBean("messageSender", MyMessageSender.class);
		sender.sendMessage("hello jms3");
	}
}
