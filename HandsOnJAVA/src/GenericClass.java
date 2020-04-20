import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		
		//IG1();
		//IG2();
		genericWildCard();
	
	}

	private static void genericWildCard() {
		Admin a = new Admin();
		a.email = "aaa.emai.com";
		a.name = "AAA";
		
		ArrayList<Admin> admins = new ArrayList<Admin>();
		admins.add(a);
		@SuppressWarnings("unchecked")
		// Convert Admins List to Person List
		List<Person> ppp = (List<Person>)(List<?>)admins;

		doSomething(ppp);
		
	}

	private static void doSomething(List<Person> ppp) {
		for (Person p: ppp) {
			System.out.println(p.email + " " + p.name);
		}
		
	}

	private static void IG2() {
		ItemGenericPair<String,String> igps1 = new ItemGenericPair<>();
		igps1.setX("ssx1");
		igps1.setY("ssy1");
		System.out.println(igps1.getX());
		System.out.println(igps1.getY());
		ItemGenericPair<String,String> igps2 = new ItemGenericPair<>();
		igps2.setX("ssx2");
		igps2.setY("ssy2");
		System.out.println(igps2.getX());
		System.out.println(igps2.getY());
		
		ItemGenericPair<Integer,Integer> igpi = new ItemGenericPair<>();
		igpi.setX(100);
		igpi.setY(200);
		System.out.println(igpi.getX());
		System.out.println(igpi.getY());
		
		ArrayList<ItemGenericPair<String,String>> pairs = new ArrayList<>();
		pairs.add(igps1);
		pairs.add(igps2);
		

		
		
	}

	private static void IG1() {
		ItemGeneric<String> igs = new ItemGeneric<String>();  // Set Generic Class as String
		igs.x = "abc";
		System.out.println(igs.x);
		System.out.println(igs.getX());
		igs.setX("def");
		System.out.println(igs.getX());
		igs.x = "www";
		
		
		ItemGeneric<Integer> igi = new ItemGeneric<Integer>(); // Set Generic Class as Integer
		igi.x = 100;
		System.out.println(igi.x);
		System.out.println(igi.getX());
		igi.setX(200);
		System.out.println(igi.getX());

		ItemGeneric<Person> igp = new ItemGeneric<Person>(); // Set Generic Class as Person
		Person p = new Person("person@mail.com","A Person");
		igp.setX(p);
		//Person person;
		//person = igp.getX();
		System.out.println(igp.getX().email);
		
	}

}
