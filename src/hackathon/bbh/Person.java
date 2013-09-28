package hackathon.bbh;

public class Person {
	
	private String name, surName;
	private String AssingnedTask;
	private int numTasks;
	
	public Person(String name, String surName){
		this.name = name;
		this.surName = surName;
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

	public String getAssingnedTask() {
		return AssingnedTask;
	}

	public void setAssingnedTask(String assingnedTask) {
		AssingnedTask = assingnedTask;
	}

	public int getNumTasks() {
		return numTasks;
	}

	public void setNumTasks(int numTasks) {
		this.numTasks = numTasks;
	}
	
	
	
	
}
