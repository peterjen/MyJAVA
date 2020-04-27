import java.util.ArrayList;
import java.util.List;

public class GenericClass_D22 {

	public static void main(String[] args) {
		ArrayList<String> aaa = new ArrayList<String>();
		aaa.add("1");
		aaa.add("sss");
		System.out.println(aaa.get(0));
		System.out.println(aaa.get(1));
		
		ItemGeneric<String> itg_str = new ItemGeneric<String>();
		itg_str.x = "World";
		System.out.println(itg_str.x);
		
		ItemGeneric<Integer> itg_int = new ItemGeneric<Integer>();
		itg_int.x = 2;
		System.out.println(itg_int.x);
		
		ItemGeneric<Person> itg_person = new ItemGeneric<Person>();
		itg_person.x = new Person("p@mail.com","P J");
		System.out.println(itg_person.x.email);
		System.out.println(itg_person.getX().name);
		System.exit(0);
		IG1();
		
		//genericWildCard();
	
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
