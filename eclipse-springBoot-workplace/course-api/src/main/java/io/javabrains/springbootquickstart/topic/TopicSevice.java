package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicSevice {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("JAVA","java", "This is java description"),
				new Topic("JAVASCRIPT","javaScript", "This is javaScript description"),
				new Topic("SQL","Sql", "This is Sql description")
				));
	
	public List<Topic> getAllTopics()
	  {
		return topics;
      }
	
	public Topic getTopics(String id)
	  {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	  }

	public void addTopics(Topic topic) 
	  {
		 topics.add(topic);
      }

	public void updateTopics(String id, Topic topic) {  
		for (int i=0 ; i< topics.size();i++)
		{
			Topic t= topics.get(i);
			if (t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopics(String id) {
		topics.removeIf(t-> t.getId().equals(id));
	}
	}