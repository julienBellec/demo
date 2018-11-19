package fr.jbellec.cleancode.pattern;

public interface UserCrud {

	public boolean create(String name);
	
	public boolean delete(String id);
	
	public String getUser();
}
