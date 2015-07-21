package com.balakrishna.beans;

import java.io.Serializable;

public class News implements Serializable {
	
	private Long id;
	private String headlines;
	private String mainStory;
	private String newsType;
	
	
	
	
	
	public News() {
		super();
	}
	public News(Long id, String headlines, String mainStory, String newsType) {
		super();
		this.id = id;
		this.headlines = headlines;
		this.mainStory = mainStory;
		this.newsType = newsType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHeadlines() {
		return headlines;
	}
	public void setHeadlines(String headlines) {
		this.headlines = headlines;
	}
	public String getMainStory() {
		return mainStory;
	}
	public void setMainStory(String mainStory) {
		this.mainStory = mainStory;
	}
	public String getNewsType() {
		return newsType;
	}
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", headlines=" + headlines + ", mainStory="
				+ mainStory + ", newsType=" + newsType + "]";
	}
	
	

}
