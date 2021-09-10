package com.im.hazelcastdemo.controller;

import com.hazelcast.collection.ISet;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("set")
public class ISetController {

    @Autowired
    private HazelcastInstance hazelcastInstance;


    @GetMapping("/add")
    public String add(@RequestParam(value = "value") String value) {
        try {
            ISet<String> set = hazelcastInstance.getSet("set");
            set.add(value);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return "success";

    }

    @GetMapping("/get")
    public String get(@RequestParam(value = "value") String value) {
        ISet<String> set;
        set = hazelcastInstance.getSet("set");
        return set.toString();
    }

}
