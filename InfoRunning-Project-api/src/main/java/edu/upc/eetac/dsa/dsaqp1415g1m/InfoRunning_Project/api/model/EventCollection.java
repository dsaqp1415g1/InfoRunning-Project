package edu.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api.model;


import java.util.ArrayList;
import java.util.List;
 
public class EventCollection {
	private List<Event> events;
	private long newestTimestamp;
	private long oldestTimestamp;
 
	public long getNewestTimestamp() {
		return newestTimestamp;
	}

	public void setNewestTimestamp(long newestTimestamp) {
		this.newestTimestamp = newestTimestamp;
	}

	public long getOldestTimestamp() {
		return oldestTimestamp;
	}

	public void setOldestTimestamp(long oldestTimestamp) {
		this.oldestTimestamp = oldestTimestamp;
	}

	public EventCollection() {
		super();
		events = new ArrayList<>();
	}
 
	public List<Event> getEvent() {
		return events;
	}
 
	public void setEvent(List<Event> events) {
		this.events = events;
	}
 
	public void addEvent(New events) {
		news.add(events);
	}
}