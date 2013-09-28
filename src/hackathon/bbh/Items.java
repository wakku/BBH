package hackathon.bbh;

public class Items {
	
	private int intemID;
	private String description;
	private String category;
	private int uID;
	private String status;
	
	public Items(int intemID, String description, String category, int uID,
			String status) {
		super();
		this.intemID = intemID;
		this.description = description;
		this.category = category;
		this.uID = uID;
		this.status = status;
	}

	public int getIntemID() {
		return intemID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getuID() {
		return uID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	

}
