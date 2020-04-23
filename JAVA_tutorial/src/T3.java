
public class T3 {
	private static String s = "aaa";
	
	public static void main(String[] args) {
		System.out.println("Hello");
		s = "ddd";
		System.out.println(s);
		
		T3 x = new T3();  
		T3.taco(); // <static> NO instance of class needed to be created
		x.bell();  // instance of class need to be created
	}
	
	public static void taco() {  // <static> NO instance of class needed to be created
		System.out.println("Hello TACOS");
	}
	
	public void bell() {  // instance of class need to be created
		System.out.println("Hello BELL");
	}

}
