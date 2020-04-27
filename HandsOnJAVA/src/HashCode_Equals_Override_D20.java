//import java.util.HashMap;
//import java.util.HashSet;

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
		System.out.println(p.hashCode());
		System.out.println(q.hashCode());
		System.out.println(p == q);
		System.out.println(p.equals(q));

		///System.exit(0);


	}

}
