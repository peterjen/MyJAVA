import java.util.ArrayList;
import java.util.List;

public class T67_Class_User_Array_load {

	public static void main(String[] args) {
		User p = new User();
		p.setFirstName("Peter");
		p.setLastName("Jen");
		User j = new User();
		j.setFirstName("June");
		j.setLastName("Chen");
		
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
		
		System.out.println("##### Instance vs Static Method (T68) ###################");
		T67_Class_User_Array_load m = new T67_Class_User_Array_load();  // m is an instance of MyUserAutoload67
		System.out.println("Call instance method from m");
		m.printUserMain(users.get(2));						// printUser here is an instance method from m
		
		System.out.println("Call instance method from class USER (T70)");
		users.get(2).printUser();						// printUser here is a instance method from User class
		
		System.out.println("Call static method from class USER (T70)");
		User.printUser(users.get(2));					// printUser here is a static method from User class
		
		System.out.println("###### Pring Users LIST from class USER static (T71) ##################");
		User.printUserList(users);
		
		System.out.println("###### Method Overload (T73) ##################");
		System.out.println(users.get(0).getFullName());
		System.out.println(users.get(1).getFullName(true));
		System.out.println(users.get(2).getFullName(false));
		
		System.out.println("###### Search user from a LIST (T74) ##################");
		System.out.println(User.findUserFromList(users, "FNAME1", "LNAME1"));
		System.out.println(User.findUserFromList(users, "fname2", "lname2"));
		
		System.out.println("###### Search user (OVERLOAD) from a LIST (T78) ##################");
		users.add(p);
		users.add(j);
		System.out.println(User.findUserFromList(users, j));
		
		User jj = new User();   // jj not added to users list but found  ????
		jj.setFirstName("June");
		jj.setLastName("Chen");
		System.out.println(User.findUserFromList(users, jj));
		System.out.println(j.equals(jj));   /////// FALSE  
		m.printUserMain(jj);
		
		int i = 5;
		System.out.println(chang_int(i));
		System.out.println(i);
		
		System.out.println("###### Overriding toString (T76) ##################");
		System.out.println(p.toString());
		System.out.println(p);
		
		System.out.println("###### Overriding HascChde and Equals (T77) ##################");
		System.out.println(p);
		System.out.println(j);
		System.out.println(p.equals(j));
		System.out.println(p.hashCode() + " " + j.hashCode());
		
		
		System.exit(0);
	}	

	public void printUserMain(User u) {
		u.setFirstName("NEW");
		System.out.println("MAIN() : " + u.getFullName());
	}
	
	public static int chang_int(int i) {
		i++;
		System.out.println("chang_int() : " + i);
		return i;
	}
}
