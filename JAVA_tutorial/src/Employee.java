
public class Employee {
	public String firstname;
	public String lastname;
	
	public Employee(String f, String l) {
		this.firstname = f;
		this.lastname = l;
	}
	public String getFullname() {
		return firstname + " " + lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
