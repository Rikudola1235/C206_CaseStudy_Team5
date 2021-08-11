
public class UserAccount {
	private String id;
	private String username;
	private String type;
	
	public UserAccount(String id, String username, String type) {
		//super(assetTag, description);
		this.id = id;
		this.username = username;
		this.type = type;
	}

	public String userid() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}
