import java.util.ArrayList;
import java.util.List;

public class GenericClass_Pair_D23_24 {

	public static void main(String[] args) {
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
		//System.exit(0);

		ItemGenericPair<String,Integer> igps3 = new ItemGenericPair<>();
		igps3.setX("ssx3");
		igps3.setY(333);
		System.out.println(igps3.getX());
		System.out.println(igps3.getY());
		//System.exit(0);
		
		ItemGenericPair<Integer,Integer> igpi = new ItemGenericPair<>();
		igpi.setX(100);
		igpi.setY(200);
		System.out.println(igpi.getX());
		System.out.println(igpi.getY());
		
		ArrayList<ItemGenericPair<String,String>> pairs = new ArrayList<>();
		pairs.add(igps1);
		pairs.add(igps2);
		

		genericWildCard();
		
	}
	
	private static void genericWildCard() {
		Admin a = new Admin();
		a.email = "a@email.com";
		a.name = "A Name";
		System.out.println("Passing admin to person method will work.");
		doSomething_admin(a); 
		
		ArrayList<Admin> admins = new ArrayList<Admin>();
		admins.add(a);
		//doSomething_person(admins);  // Will Not Work
		doSomething_person2(admins);  // Use WILDCARD on doSomething_person2 will work. DAY 24
		ArrayList<Person> adminsPerson = new ArrayList<>();
		for (Admin adm : admins) {
			adminsPerson.add((Person)adm);
		}
		doSomething_person(adminsPerson);  // Convert Admin List to Person list Will Not Work
		
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(a);
		doSomething_person(persons);

		
		
		//System.exit(0);
		
		// Convert Admins List to Person List. DAY 24
		@SuppressWarnings("unchecked")
		List<Person> wildcard_person = (List<Person>)(List<?>)admins;	
		doSomething_list(wildcard_person);
	}

	private static void doSomething_person2(ArrayList<? extends Person> admins) {
		for (Person p : admins) {
			System.out.println("doSomething_person2() WILDCARD : " + p.email + " " + p.name);
		}
		
	}

	private static void doSomething_person(ArrayList<Person> admins) {
		for (Person p : admins) {
			System.out.println("doSomething_person() : " + p.email + " " + p.name);
		}
		
	}
	private static void doSomething_admin(Person p) {
		System.out.println("doSomething_admin() : " + p.email);
		
	}

	private static void doSomething_list(List<Person> ppp) {
		for (Person p: ppp) {
			System.out.println("doSomething_list() : " + p.email + " " + p.name);
		}
		
	}

}
