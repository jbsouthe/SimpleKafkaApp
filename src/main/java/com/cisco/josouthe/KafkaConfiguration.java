package com.cisco.josouthe;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka")
@EnableKafka
public class KafkaConfiguration {

    @Bean
    public RecordMessageConverter converter() {
        return new JsonMessageConverter();
    }

    private String firstGroup;
    private String testTopic;
    private String usersTopic;
}
