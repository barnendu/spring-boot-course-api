package com.barnendu.springBoot.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class dTopicService {
	private List<Topic> topics = new ArrayList(Arrays.asList(
			new Topic("1", "Spring Boot", "Spring Boot Courses"),
			new Topic("2", "Node", "Node.js Courses"),
			new Topic("3", "React", "React.js Courses")
			));

	public List<Topic> getAllTopic(){
		return topics;
		
	}
	public Topic getTopic(String id) {
		Topic filterTopic= topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		if(filterTopic ==null) {
			throw new UserNotFoundException("id::"+id);
		}
		return filterTopic;
	}
	
	public List<Topic> addTopic(Topic topic) {
		topics.add(topic);
		return topics;
	}
	public List<Topic> updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i=0 ; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if( t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		return topics;
	}
}
