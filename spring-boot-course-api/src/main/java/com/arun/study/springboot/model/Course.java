package com.arun.study.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Course {
	
	@Id
	private String id;
	private String title;
	private String duration;
	private String tuitor;
	
	public Course() {
		super();
	}
	
	public Course(String id, String title, String duration, String tuitor) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.tuitor = tuitor;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTuitor() {
		return tuitor;
	}
	public void setTuitor(String tuitor) {
		this.tuitor = tuitor;
	}
}
