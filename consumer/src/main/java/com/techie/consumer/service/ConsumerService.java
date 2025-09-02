package com.techie.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    public static final String CAB_LOCATION = "cab-location";
    public static final String CONSUMER_GROUP = "consumer-group";
    public static int messageCounter=0;

    @KafkaListener(topics = CAB_LOCATION,groupId = CONSUMER_GROUP,concurrency = "2")
    public void cabLocation(String location){
        System.out.println("Thread::"+ Thread.currentThread().getName()+" ,"+location);
    }

}
