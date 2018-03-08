package com.javainuse.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${javainuse.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${javainuse.rabbitmq.routingkey}")
	private String routingkey;	
	
	String kafkaTopic = "java_in_use_topic";
	
	public void send(Employee company) {
		amqpTemplate.convertAndSend(exchange, routingkey, company);
		System.out.println("Send msg = " + company);
	    
	}
	
	@Autowired
    public RabbitMQSender(final AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

//    @Scheduled(fixedDelay = 3000L)
//    public void sendMessage() {
//        final Employee message = new Employee("Hello there!", new Random().nextInt(50), false);
//        //log.info("Sending message...");
//        amqpTemplate.convertAndSend(exchange, routingkey, message);
//    }
	
	
}