package br.com.tdc.javaee.javaamqp.sender;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AMQPSender {

	@Autowired
	private AmqpTemplate amqpTemplate;

	private Logger logger = Logger.getLogger(AMQPSender.class);

	public void sendMessage(String message) {
		logger.info("Enviando mensagem " + message);
		amqpTemplate.convertAndSend(message.getBytes());
	}

}