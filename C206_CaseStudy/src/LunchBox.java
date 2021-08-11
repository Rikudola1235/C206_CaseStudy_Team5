
public class LunchBox extends UserAccount{
	
	private String lunchboxName;
	private String category;
	private double price;
	
	public LunchBox(String id, String username, String type, String lunchboxName, String category, double price) {
		super(id, username, type);
		this.lunchboxName = lunchboxName;
		this.category = category;
		this.price = price;
	}
	
	public String getLunchBoxName() {
		return lunchboxName;
	}

	public String getCategory() {
		return category;
	}
	
	public double getPrice() {
		return price;
	}
}
