package fr.jbellec.demo.pattern.builder;

import java.util.Date;

public class Task {
	private final long id;
	private String title = "";
	private String description = "";
	private Date dueDate;

	public Task(long id) {
		this.id = id;
	}

	public Task(long id, String title, String description, Date dueDate) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {		
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", dueDate=" + dueDate + "]";
	}
	
	
}