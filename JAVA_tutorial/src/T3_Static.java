public class T3_Static {
	private static String s = "aaa";

	public static void main(String[] args) {
		System.out.println("Hello");
		s = "ddd";
		System.out.println(s);

		T3_Static x = new T3_Static();  
		T3_Static.taco(); // <static> NO instance of class needed to be created
		x.bell();  // instance of class need to be created
		// x.taco();
	}

	public static void taco() {  // <static> NO instance of class needed to be created
		System.out.println("Hello TACOS");
	}

	public void bell() {  // instance of class need to be created
		System.out.println("Hello BELL");
	}

}