package com.example.CSE.CSE5.SPRING.controller;

import com.example.CSE.CSE5.SPRING.model.topic;
import com.example.CSE.CSE5.SPRING.service.topicservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Server {

    @Autowired
    topicservice TopicService;

    @GetMapping("/")
    public String hello(){
        return "hello mam";
    }

    @GetMapping("/sarvilhello")
    public List<topic> sarvil(){
        return TopicService.getSarvil();
    }

    @GetMapping("/sarvilhello/{myid}")
    public topic hell(@PathVariable String myid){
        return TopicService.hell(myid);
    }
    @PostMapping("/sarvilhello")
    public topic sarvilpost(@RequestBody topic t){
        return TopicService.addTopic(t);
    }

}