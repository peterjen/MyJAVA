import java.util.HashMap;
import java.util.HashSet;

public class HashSet_D21 {

	public static void main(String[] args) {
		//DAY 21
		System.out.println("------------ DAY 21 HASHSET");
		HashSet<String> words = new HashSet<String>();
		words.add("hello");
		words.add("bye");
		words.add("dog");
		words.add("cat");
		words.add("ice");
		words.add("taco");
		words.add("fish");
		words.add("net");
		for (String s : words) {
			System.out.println(s);  
		}
		System.out.println("HASHSE contains(\"fish\"): " + words.contains("fish"));
		
		
		Person p = new Person("ppp@email.com","Peter");
		Position pos1 = new Position(10,10);
		p.position = pos1;
		Person q = new Person("ppp@email.com","Peter");
		Position pos2 = new Position(10,10);
		q.position = pos2;
		
		HashSet<Person> ppl = new HashSet<Person>();
		ppl.add(p);
		ppl.add(q);
		System.out.println(ppl.contains(p));
		
		Person newp = new Person("ppp@email.com","Peter");
		//Position pos1 = new Position(10,10);
		newp.position = pos1; // newp is not added to ppl, but ppl contains newp, because we override the equals() in PERSON
		System.out.println("newp == p? " + newp.equals(p));
		System.out.println("ppl contains newp? " + ppl.contains(newp));
		
		System.out.println("------------ DAY 21 HASHMAP");
		HashMap<Integer,String> peek = new HashMap<Integer,String>();
		peek.put(123, "June");
		peek.put(456, "John");
		peek.put(123, "CJ");   // Duplicate KEY not allowed in HashMap (so overwrite June)
		System.out.println("HashMap peek contains? " + peek.containsKey(123));
		System.out.println(peek.entrySet());

	}

}
