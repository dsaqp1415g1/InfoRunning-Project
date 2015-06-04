package edu.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api.model;


import java.util.ArrayList;
import java.util.List;
 
public class NewsCollection {
	private List<News> stings;
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

	public NewsCollection() {
		super();
		news = new ArrayList<>();
	}
 
	public List<News> getNews() {
		return news;
	}
 
	public void setNews(List<news> news) {
		this.news = news;
	}
 
	public void addNews(New news) {
		news.add(news);
	}
}