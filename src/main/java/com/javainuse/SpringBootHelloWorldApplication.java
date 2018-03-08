package com.javainuse;

import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication implements RabbitListenerConfigurer  {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		//SpringApplication.run(
			//	new Object[] { SpringBootHelloWorldApplication.class }, args);
	}
	@Override
	public void configureRabbitListeners(RabbitListenerEndpointRegistrar arg0) {
	}
}