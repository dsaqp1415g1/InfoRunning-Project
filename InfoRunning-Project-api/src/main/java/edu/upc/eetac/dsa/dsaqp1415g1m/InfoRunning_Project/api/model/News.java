package edu.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api.model;

public class News {

	private int newsid;
	private String newsbody;
	private String url;

	public News() {
		super();
	}
	public String getNewsbody() {
		return newsbody;
	}

	public void setNewsbody(String newsbody) {
		this.newsbody = newsbody;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}