import java.util.HashMap;
import java.util.HashSet;

public class HashCode_Equals_Override_D20 {

	public static void main(String[] args) {
		// DAY 20
		
		//Object ss = "Hello";
		//Object tt = "Hello";
		//System.out.println(ss.hashCode());
		//System.out.println(tt.hashCode());

		Person p = new Person("ppp@email.com","Peter");
		Position pos1 = new Position(10,10);
		p.position = pos1;
		
		Person q = new Person("ppp@email.com","Peter");
		Position pos2 = new Position(10,10);
		q.position = pos2;
		System.out.println(p.equals(q));
		System.out.println(p.hashCode());
		System.out.println(q.hashCode());
		

		//DAY 21
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
		System.out.println(words.contains("fish"));
		
		HashSet<Person> ppl = new HashSet<Person>();
		ppl.add(p);
		ppl.add(q);
		System.out.println(ppl.contains(p));
		
		Person newp = new Person("ppp@email.com","Peter");
		//Position pos1 = new Position(10,10);
		newp.position = pos1; // newp is not added to ppl, but ppl contains newp
		System.out.println("newp == p? " + newp.equals(p));
		System.out.println("ppl contains newp? " + ppl.contains(newp));
		
		HashMap<Integer,String> peek = new HashMap<Integer,String>();
		peek.put(123, "June");
		peek.put(456, "John");
		peek.put(789, "CJ");
		System.out.println("HashMap peek contains? " + peek.containsKey(123));
		System.out.println(peek.entrySet());
	}

}
