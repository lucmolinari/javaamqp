package br.com.tdc.javaee.javaamqp.consumer;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Consumer implements MessageListener {

	private Logger logger = Logger.getLogger(Consumer.class);

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("/applicationContext-consumer.xml");
	}

	@Override
	public void onMessage(Message message) {
		String msg = new String(message.getBody());
		logger.info("----------Recebeu msg " + msg);
	}

}