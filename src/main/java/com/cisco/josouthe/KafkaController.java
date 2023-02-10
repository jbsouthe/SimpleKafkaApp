package com.cisco.josouthe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private static final Logger logger = LogManager.getFormatterLogger();
    private final SimpleProducer producer;

    @Autowired
    KafkaController( SimpleProducer simpleProducer ) {
        this.producer = simpleProducer;
    }

    @PostMapping( value = "/publish")
    public void sendMessageToKafkaTopic( @RequestParam("message") String message ) {
        this.producer.sendMessage(message);
    }
}
