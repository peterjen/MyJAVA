
public class T18_String_Comparison {

	public static void main(String[] args) {
		String s1 ="asd";
		String s2 ="asd";
		String s3 = new String("asd");

		System.out.println("Compare Primitives:::");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));  // Correct way....
		
		System.out.println("Compare Objects:::");		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

	}

}
