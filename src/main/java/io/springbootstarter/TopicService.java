package io.springbootstarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("sprint", "spring framework", "hih"),
			new Topic("clean", "clean code", "hih"), new Topic("java", "java book", "pppppi")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
	  for (int i = 0; i < topics.size(); i++) {
		  Topic t = topics.get(i);
		  if (t.getId().equals(id)) {
			  topics.set(i, topic);
			  return;
		  }
	  }
		
	}
}
