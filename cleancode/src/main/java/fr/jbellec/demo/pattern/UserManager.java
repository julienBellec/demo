package fr.jbellec.demo.pattern;

public class UserManager implements UserConnection, UserCrud  {

	public boolean connect() {		
		return true;
	}

	public boolean disconnect() {
		return true;
	}

	public boolean create(String name) {
		return true;
	}

	public boolean delete(String id) {
		return true;
	}

	public String getUser() {
		return "1234";
	}
	
	

}
