import java.util.ArrayList;
import java.util.List;

public class MyUserAutoload67 {

	public static void main(String[] args) {
		User p = new User();
		p.setFirstName("Peter");
		p.setLastName("Jen");
		User j = new User();
		j.setFirstName("Peter");
		j.setLastName("Jen");
		
		String[] fn = {"fname1","fname2","fname3"};
		String[] ln = {"lname1","lname2","lname3"};
		List<User> users = new ArrayList<User>();

		for (int i=0 ; i < fn.length; i++) {
			User u = new User();
			u.setFirstName(fn[i]);
			u.setLastName(ln[i]);
			users.add(u);
		}
		
		for (User u : users) {
			System.out.println(u.getFullName());
		}
		
		System.out.println("##### Instance vs Static Method ###################");
		MyUserAutoload67 m = new MyUserAutoload67();  // m is an instance of MyUserAutoload67
		System.out.println("Call instance method from m");
		m.printUser(users.get(2));						// printUser here is an instance method from m
		
		System.out.println("Call instance method from class USER");
		users.get(2).printUser();						// printUser here is a instance method from User class
		
		System.out.println("Call static method from class USER");
		User.printUser(users.get(2));					// printUser here is a static method from User class
		
		System.out.println("###### Pring Users LIST ##################");
		User.printUserList(users);
		
		System.out.println("###### Method Overload  ##################");
		System.out.println(users.get(2).getFullName());
		System.out.println(users.get(2).getFullName(true));
		System.out.println(users.get(2).getFullName(false));
		
		System.out.println("###### Search user from a LIST ##################");
		System.out.println(User.findUserFromList(users, "FNAME1", "LNAME1"));
		System.out.println(User.findUserFromList(users, "fname2", "lname2"));
		
		
		System.out.println("###### Overriding toString ##################");
		System.out.println(p.toString());
		
		System.out.println("###### Overriding HascChde and Equals ##################");
		System.out.println(p);
		System.out.println(j);
		System.out.println(p.equals(j));
		System.out.println(p.hashCode() + " " + j.hashCode());
	}	

	public void printUser(User u) {
		System.out.println(u.getFullName());
	}
}
