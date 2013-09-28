package hackathon.bbh;

public class Reviews {
	
	private String outcome;
	private int taskID;
	private int userID;
	
	public Reviews(String outcome, int taskID, int userID){
		this.outcome = outcome;
		this.taskID = taskID;
		this.userID = userID;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public int getTaskID() {
		return taskID;
	}

	public int getUserID() {
		return userID;
	}

}
