package com.im.hazelcastdemo.controller;

import com.hazelcast.collection.IList;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("ilist")
@RestController
public class IListController {

    @Autowired
    private HazelcastInstance hazelcastInstance;


    @GetMapping("/add")
    public String put(@RequestParam(value = "value") String value) {
        IList<String> list = hazelcastInstance.getList("list");
        list.add(value);
        return "success";
    }

    @GetMapping("/get")
    public IList<String> get() {
        IList<String> list = hazelcastInstance.getList("list");
        return list;
    }


}
