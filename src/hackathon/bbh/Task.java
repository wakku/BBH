package hackathon.bbh;

public class Task {

	private int taskID;
	private String description;
	private String status;
	private String due_date;
	private int uID;
	
	public Task(int taskID, String description, String status, String due_date,
			int uID) {
		super();
		this.taskID = taskID;
		this.description = description;
		this.status = status;
		this.due_date = due_date;
		this.uID = uID;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}	
	
}
