import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String,Integer> student = new HashMap<String,Integer>();
		student.put("Peter", 100);
		student.put("June", 101);
		//student.put("Peter", student.getOrDefault("Peter", 500)+1);
		//System.out.println(student.get("Peter"));
		for(String ss :student.keySet()) {
			System.out.println("KEY:" + ss);
		}
		for(int ss :student.values()) {
			System.out.println("VALUE:" +ss);
		}
		System.out.println(student.entrySet());

		
	}

}
