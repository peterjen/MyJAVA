
public class GenericClass {

	public static void main(String[] args) {
		ItemGeneric<String> igs = new ItemGeneric<String>();  // Set Generic Class as String
		igs.x = "abc";
		System.out.println(igs.x);
		System.out.println(igs.getX());
		igs.setX("def");
		System.out.println(igs.getX());
		
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
