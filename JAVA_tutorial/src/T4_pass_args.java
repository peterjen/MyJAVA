
public class T4_pass_args {

//	D:\eclipse-workspace\JAVA_tutorial\bin>java T4_pass_args Peter
//	Hello Peter
	public static void main(String[] args) {
		if(args[0] != null) {
			System.out.println("Hello " + args[0]);
		}
		else {
			System.out.println("Hey!");
		}

	}

}