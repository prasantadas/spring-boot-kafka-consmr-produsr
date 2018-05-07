package com.kafka.example.springbootkafkaconsumerproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Receiver {

	private String messsage;
	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

	@KafkaListener(topics = "${kafka.topic.helloworld}")
	public void receive(String payload) {
		LOGGER.info("received payload='{}'", payload);
		setMesssage(payload);

	}
}
