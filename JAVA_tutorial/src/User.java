import java.util.List;

public class User {

	private String firstName;
	public String lastName;
	
	public String getFullName() {
		return this.firstName + " " + lastName;
	}
	
	public String getFullName(boolean nice) {
		if(nice) {
			return this.firstName + " " + lastName + " is a nice guy.";
		}
		return this.firstName + " " + lastName + " is not a nice guy.";
	}
	
	public void setLastName(String str) {
		this.lastName = str;
	}
	public void setFirstName(String str) {
		this.firstName = str;
	}
	
	public String says(String w) {
		return firstName + " SAYS " + w ;
	}
	
	public void printUser() {							// instance method
		System.out.println(getFullName());
	}
	
	public static void printUser(User u) {				// static method
		System.out.println(u.getFullName());
	}
	
	public static void printUserList(List<User> u) {				// static method
		for (User i : u) {
			System.out.println(i.getFullName());
		}
		
	}
	
	public static int findUserFromList(List<User> ulist,String ff, String ll) {
		for (int i = 0; i < ulist.size(); i++ ) {
				if (ulist.get(i).getFullName().equals(ff + " " + ll)) {
					return i;
				}
		}
		return -1;
	}
/*
	@Override
	public String toString() {
		return "User [getFullName()=" + getFullName() + "]";
	}
*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
}
