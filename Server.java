package com.example.CSE.CSE5.SPRING;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController

public class Server {
    List<topic> sarvil=new ArrayList<>(
            Arrays.asList(
                    new topic("101","saurydeep singh","address"),
                    new topic("102","Sarvil","dehradun"),
                    new topic("103","sanjana singh","Jamshedpur"),
                    new topic("104","Saksham","dehradun")



            )
    );

    @RequestMapping("/")
    public String hello(){
        return "hello mam";
    }



    @RequestMapping("/sarvilhello")
    public List<topic> sarvil(){
        return sarvil;

    }
    @RequestMapping("/sarvilhello/{myid}")
    public topic hell(@PathVariable String myid){
        Optional<topic> foundtopic= sarvil.stream().filter(t -> t.getId().equals(myid)).findFirst();
        if(foundtopic.isPresent()){
            return foundtopic.get();
        }
        else{
            return new topic("N/A","N/A","N/A");
        }
    }

}
