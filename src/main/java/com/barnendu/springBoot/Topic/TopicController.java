package com.barnendu.springBoot.Topic;

import java.util.List;

import javax.validation.Valid;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopic() {
		
		return topicService.getAllTopic();
				
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic( @PathVariable String id) {
		return topicService.getTopic(id);
	}
    
	@RequestMapping(method = RequestMethod.POST, value ="/topic")
	public List<Topic> addTopic(@Valid @RequestBody Topic topic ){
		
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
	public List<Topic> updateTopic(@RequestBody Topic topic , @PathVariable String id) {
		return topicService.updateTopic(topic,id);
	}
}
