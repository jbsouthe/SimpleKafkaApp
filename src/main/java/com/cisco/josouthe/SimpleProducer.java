package com.cisco.josouthe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SimpleProducer {
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage( String message ) {
        sendMessage(TOPIC, message);
    }

    public void sendMessage( String topic, String message ) {
        //log.info("Prodicing Topic: '%s' Message: '%s'",topic, message);
        this.kafkaTemplate.send(topic, message);
    }

}
