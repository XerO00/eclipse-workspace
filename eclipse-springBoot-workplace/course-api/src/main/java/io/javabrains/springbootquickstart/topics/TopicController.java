package io.javabrains.springbootquickstart.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootquickstart.topic.Topic;
import io.javabrains.springbootquickstart.topic.TopicSevice;

@RestController
public class TopicController {

    @Autowired
    private TopicSevice topicService ;

    @RequestMapping("/topics/{id}")
    public Topic getTopics(@PathVariable String id){
    	System.out.println("Inside TopicController");	
    	return topicService.getTopics(id);
	 }

        @RequestMapping(method=RequestMethod.GET, value="/topics")
    public List<Topic> getAllTopics(){
    	System.out.println("Inside TopicController");
		return topicService.getAllTopics();
	 }

    
    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopics(@RequestBody Topic topic){
    	topicService.addTopics(topic);
	 }

    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopics(@RequestBody Topic topic,@PathVariable String id){
    	topicService.updateTopics(id,topic);
	 }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopics(@PathVariable String id){
    	topicService.deleteTopics(id);
	 }
}
