package com.br.thekingoftech.mensageria.component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

public class OrderConsumer {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@KafkaListener(topics = "${order.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(String order) {
		LOG.info("Order: " + order);
    }
}
