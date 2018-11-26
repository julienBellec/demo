package fr.jbellec.demo.pattern.builder;

public class Main {

	public static void main(String[] args) {

		Task task = (new TaskBuilder(1, "Title")).withDescription("Description").build();
		System.out.println(task.toString());
	}

}
