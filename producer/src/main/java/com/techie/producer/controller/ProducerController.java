package com.techie.producer.controller;

import com.techie.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range = 25;
        while(range >0){
            //System.out.println(Math.random()+" , "+Math.random());
            producerService.updateLocation(Math.random()+" , "+Math.random());
            Thread.sleep(1000);
            range--;
        }
        return new ResponseEntity<>(Map.of("message","location updated")
        ,HttpStatus.OK);
    }

}
