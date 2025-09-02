package com.techi.notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public static final String CAB_LOCATION = "cab-location";
    public static final String CONSUMER_GROUP = "consumer-group";

    @KafkaListener(topics = CAB_LOCATION, groupId = CONSUMER_GROUP,concurrency = "2")
    public void getLocation(String location){
        System.out.println("Thread name::"+Thread.currentThread().getName()+" , "+location);


    }
}
