package com.springdatabase.Student_dbms.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

   
    @Autowired 
    private TopicRepository topicRepository; 

    public  List<Topic> getAllTopics()
        {
            List<Topic> topics = new ArrayList<>();
            topicRepository.findAll()
            .forEach(topics::add);
            return topics; 
        }    

    public Topic getTopic(String id)
    {
        Topic t =topicRepository.findById(id).get();
        return t;
        
    }

    public void addTopic(Topic topic) {

        topicRepository.save(topic);

    }

    public void updateTopic(Topic topic, String id) {

       topicRepository.save(topic);
    }

    public void deleteTopic(String id) {

        topicRepository.deleteById(id);
    }
}
