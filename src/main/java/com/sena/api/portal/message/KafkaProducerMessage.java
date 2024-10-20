package com.sena.api.portal.message;

import com.sena.api.portal.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerMessage {

    @Autowired
    private KafkaTemplate<String, CarPostDTO> kafkaTemplate;

    private final String KAFKA_TOPIC = "car-post-topic";

    public void sendMessage (CarPostDTO carPostD) {
        kafkaTemplate.send(KAFKA_TOPIC, carPostD);
    }

}
