# Spring Integration with jms.

Setup
1. Download and install Activemq server. http://activemq.apache.org/activemq-5145-release.html
2. ./activemq start (https://stackoverflow.com/questions/32582856/install-configure-activemq-on-mac) 
3. go to http://localhost:8161/admin/
4. create myqueue from Activemq UI.


Create Receiver Application
1. Go through reference on how to create a receiver application.
2. check the example applciation (jmsreceiver)added.
3. run the main method. It should be listening for messages on myQueue.

Create a Sender Application
1. 


References:
Spring integration with jms - https://www.javatpoint.com/spring-and-jms-integration


Spring jms listeners
https://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/jms.html

Spring jms channel
http://docs.spring.io/spring-integration/reference/html/jms.html
https://www.youtube.com/watch?v=icIosLjHu3I
