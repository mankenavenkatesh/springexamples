#Experiments with Rabbit mq

Installation
1. Rabbitmq is a messaging broker. dowload it from https://www.rabbitmq.com/download.html and install.
2. brew install rabbitmq
3. https://www.rabbitmq.com/install-homebrew.html
4. rabbitmq-server command will start the server
4. The RabbitMQ server scripts are installed into /usr/local/sbin. This is not automatically added to your path, so you may wish to add
PATH=$PATH:/usr/local/sbin to your .bash_profile or .profile. The server can then be started with rabbitmq-server.


configure management plugin
https://www.rabbitmq.com/management.html
access it at
http://localhost:15672/#/

References


https://www.rabbitmq.com/tutorials/tutorial-one-spring-amqp.html
https://spring.io/guides/gs/messaging-rabbitmq/
