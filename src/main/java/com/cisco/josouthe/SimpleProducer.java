package com.cisco.josouthe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducer {
    private static final Logger logger = LogManager.getFormatterLogger();
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage( String message ) {
        sendMessage(TOPIC, message);
    }

    public void sendMessage( String topic, String message ) {
        logger.info("Prodicing Topic: '%s' Message: '%s'",topic, message);
        this.kafkaTemplate.send(topic, message);
    }

}
