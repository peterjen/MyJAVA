import java.util.ArrayList;
import java.util.List;

public class T59_66_Class_User
{

	public static void main(String[] args) {

		User you = new User();
		User me = new User();
		User him = new User("He","Him");  // Define obj with constructor
		//user.firstName = "Peter";
		you.lastName = "Jen";
		System.out.println(him.getFullName());

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


		T59_66_Class_User x = new T59_66_Class_User();
		x.tacos();
		bell();

	}

	public void tacos() {  // instance of class
		System.out.println("Tacos");

	}

	public static void bell() {  // static of class
		System.out.println("Bell");
	}

}