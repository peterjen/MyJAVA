import java.util.HashMap;
import java.util.Set;

public class HashMapD18 {

	public static void main(String[] args) {

		HashMap<String,Integer> student = new HashMap<String,Integer>();
		student.put("Peter", 100);
		student.put("June", 200);
		student.put("JJ", 300);
		student.put("Peter", student.getOrDefault("Peter", 500)+1);
		System.out.println(student.get("Peter"));
		
		System.out.println(student.keySet());
		System.out.println(student.values());
		
		Set<String> keys = student.keySet();
		//Set<String,Integer> vals = student.entrySet();
		//Set<Integer> values = student.values();
		System.out.println(keys);
		//System.out.println(vals);
		
		for(String ss :student.keySet()) {
			System.out.println("KEY:" + ss);
		}
		for(int ss :student.values()) {
			System.out.println("VALUE:" +ss);
		}

		
		System.out.println(student.entrySet());

		String sss = "Hello";
			System.out.println(sss.hashCode());
			
		
	}

}
