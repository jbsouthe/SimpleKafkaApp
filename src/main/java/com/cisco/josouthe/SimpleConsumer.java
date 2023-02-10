package com.cisco.josouthe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SimpleConsumer {
    private static final Logger logger = LogManager.getFormatterLogger();

    @KafkaListener( topics = "users", groupId = "group_id")
    public void consume( String message ) throws IOException {
        logger.info("Consumed Message: '%s'",message);
    }
}
