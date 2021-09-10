package com.im.hazelcastdemo.controller;

import com.hazelcast.collection.IQueue;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IQueueController {

    @Autowired
    private HazelcastInstance hazelcastInstance;


    @GetMapping("/put")
    public String put(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        try {
            IQueue<String> queue = hazelcastInstance.getQueue("queue");
            queue.put("foo");
            queue.put("bar");
            queue.take();
            queue.take();
        }catch (Exception exception){
            exception.printStackTrace();
        }

        return "success";
    }

}

