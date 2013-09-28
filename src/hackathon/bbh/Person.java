package hackathon.bbh;

public class Person {
	
	private String name, surName;
	private int uID;
	
	public Person(String name, String surName, int uID){
		this.name = name;
		this.surName = surName;
		this.uID = uID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public int getUID() {
		return uID;
	}

	public void setUID(int uID) {
		this.uID = uID;
	}
	
}
