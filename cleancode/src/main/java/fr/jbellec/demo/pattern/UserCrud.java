package fr.jbellec.demo.pattern;

public interface UserCrud {

	public boolean create(String name);
	
	public boolean delete(String id);
	
	public String getUser();
}
