package Entities.Concretes;

public class User {
	private int id ; 
	private	String firstName;
	private	String lastname;
	private	String email;
	private	String password;
	public User(String firstName, String lastname, String email, String password) {
		super();
		this.id +=1;
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
