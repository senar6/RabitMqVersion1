package com.javainuse.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.javainuse.model.Employee;

@Component
public class CustomMessageListener {
	
	
	
    private static final Logger log = LoggerFactory.getLogger(CustomMessageListener.class);

/*    @RabbitListener(queues = SpringBootHelloWorldApplication.QUEUE_GENERIC_NAME)
    public void receiveMessage(final Message message) {
        log.info("Received message as generic: {}", message.toString());
    }*/

    @RabbitListener(queues = "${javainuse.rabbitmq.queue}")
    public void receiveMessage(final Employee customMessage) {
        
    	log.info("Received message as specific class: {}", customMessage.toString());
    	//return customMessage.toString();
    //	setMessage
    }
   
}

