package br.com.tdc.javaee.javaamqp.sender;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.tdc.javaee.javaamqp.sender.AMQPSender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext-sender.xml")
public class TestAMQPSender {

	@Autowired
	private AMQPSender amqpSender;

	@Test
	public void testSend() {
		amqpSender.sendMessage("Test Message");
	}

}