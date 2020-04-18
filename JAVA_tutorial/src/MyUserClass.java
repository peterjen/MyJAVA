import java.util.ArrayList;
import java.util.List;

public class MyUserClass
{

	public static void main(String[] args) {
		
		User you = new User();
		User me = new User();
		//user.firstName = "Peter";
		//you.lastName = "Jen";
		//System.out.println(you.getFullName());
		
		you.setFirstName("June");
		you.setLastName("Chen");
		me.setFirstName("Peter");
		me.setLastName("Jen");
		System.out.println(you.getFullName());
		System.out.println(you.says("SHIT") );
		
		List<User> users = new ArrayList<User>();
		users.add(me);
		users.add(you);
		
		System.out.println(users.get(0).getFullName());
		System.out.println(users.get(1).getFullName());
		
		
	}
	
	public void tacos() {
		System.out.println("Tacos");

	}

}
