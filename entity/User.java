package entity;

public class User {
	

	private int Id;
	private String Tck;
	private String firstName;
	private String LastName;
	private double Money;
	
public User() {
		
	}
	
	public User(int Id, int Money, String firstName, String LastName, String Tck ) {
		this.Id = Id;
		this.Money = Money;
		this.firstName = firstName;
		this.LastName = LastName;
		this.Tck = Tck;
		}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTck() {
		return this.Tck;
	}
	public void setTck(String tck) {
		Tck = tck;
	}
	
	public void setFirstName(String FirstName) {
		
		this.firstName = FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public double getMoney() {
		return Money;
	}
	public void setMoney(double money) {
		Money = money;
	}

	public String getFirstName() {
		
		return this.firstName;
	}

}

	
	
