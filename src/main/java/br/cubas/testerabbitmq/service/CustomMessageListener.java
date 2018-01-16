package br.cubas.testerabbitmq.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import br.cubas.testerabbitmq.model.Employee;


@Service
public class CustomMessageListener {
	

    @RabbitListener(queues = "${javainuse.rabbitmq.queue}")
    public void receiveMessage(final Employee company) {
    	System.out.println("received: " + company.toString());
    }
}