package com.cisco.josouthe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class SimpleConsumer {

    @KafkaListener( topics = "users", groupId = "group_id")
    public void consume( String message ) throws IOException {
        //log.info("Consumed Message: '%s'",message);
    }
}
