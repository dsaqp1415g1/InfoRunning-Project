package edu.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api.model;

public class Event {

	private int eventid;
	private String eventbody;
	private String url;
	private datatime expire_time;

	public Event() {
		super();
	}
	public String getEventbody() {
		return eventbody;
	}

	public void setEventbody(String eventbody) {
		this.eventbody = eventbody;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public datatime getExpireTime() {
		return expire_time;
	}

	public void setExpireTime(datatime expire_time) {
		this.expire_time = expire_time;
	}
	
}