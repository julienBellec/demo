package fr.jbellec.demo.pattern.builder;

import java.util.Date;

public class TaskBuilder {
	
	private final long id;
	private String title = "";
	private String description = "";
	private Date dueDate;

	public TaskBuilder (final long id, final String title) {
		this.id = id;
		this.title = title;
	}
	
	public TaskBuilder withDescription (String description) {
		this.description = description;
		return this;
	}

	public TaskBuilder withDueDate (Date dueDate) {
		this.dueDate = dueDate;
		return this;
	}
	
	public Task build() {
		return new Task(id, title, description, dueDate);
	}

}
