package com.example.CSE.CSE5.SPRING.service;

import com.example.CSE.CSE5.SPRING.Repository.TopicRepo;
import com.example.CSE.CSE5.SPRING.model.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class topicservice {

    @Autowired
    TopicRepo Repo;

    public List<topic> getSarvil(){
        return Repo.findAll();
    }

    public topic hell(String myid){
        Optional<topic> foundtopic = Repo.findById(myid);

        if(foundtopic.isPresent()){
            return foundtopic.get();
        } else {
            return new topic("N/A","N/A","N/A");
        }
    }

    public topic addTopic(topic t) {
        return Repo.save(t);
    }
}