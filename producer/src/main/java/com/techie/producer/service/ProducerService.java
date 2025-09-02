package com.techie.producer.service;

import com.techie.producer.constants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location){

        kafkaTemplate.send(AppConstants.CAB_LOCATION, location);
        return true;

    }
}
