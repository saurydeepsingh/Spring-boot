package com.example.CSE.CSE5.SPRING.Repository;
import com.example.CSE.CSE5.SPRING.model.topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends JpaRepository<topic,String> {

}
