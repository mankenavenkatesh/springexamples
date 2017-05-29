package com.example.jmsreceiver;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener{

	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		TextMessage message =(TextMessage) arg0;
		try{
			System.out.println(message.getText());			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
