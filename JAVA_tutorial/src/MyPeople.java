import java.util.ArrayList;
import java.util.List;

public class MyPeople {

	public static void main(String[] args) {
		Student s = new Student();
		s.firstName = "JJ";
		s.lastName = "Jen";
		s.major = "Math";
		System.out.println(s.verified);
		System.out.println(s.major);
		s.getFullName();
		s.sayHello();
		
		/*
		People ple = new People();
		ple.firstName="GG";
		ple.lastName="ZZ";
		ple.getFullName();
		*/
		
		
		System.out.println("####### Polymorphism ");
		Jen me = new Jen();                         // Jen Class
		Jen you = new Jen();						// Jen Class
		me.setFirstName("Peter");
		me.setLastName("Jen");
		you.setFirstName("June");
		you.setLastName("Chen");
		
		List<User> ulist = new ArrayList<User>();	// User <LIST>  Class
		ulist.add(me);								// Add Jen Class to User class List
		ulist.add(you);
		User.printUserList(ulist);
		
		System.out.println("####### Constructer ");
		Teacher t = new Teacher("Teach","Er");     // user defined constructer
		t.getFullName();
		t.sayHello();
		
		System.out.println("####### Call Parent level method using SUPER ");
		Teacher t2 = new Teacher();					// 
		t2.getFullName();
		t2.sayHello();
		t2.sayHi();
		
		System.out.println("####### Call interface from Talk ");
		t2.sayWelcome();
		s.sayWelcome();
		
		
	}

}