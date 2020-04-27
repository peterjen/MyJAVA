//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;

public class MyExceptions {

	public static void main(String[] args) throws Exception  {
		//int x = Integer.parseInt("pizza");
		//System.out.println(x);
		
//		ArrayList<Integer> a = new ArrayList<Integer>();
		//a.get(5);

		//FileInputStream ff = new FileInputStream("src/Mazes.txt");
		
		MyExceptions thisException = new MyExceptions();
		thisException.doSomething();
		
	}

	private void doSomething() throws Exception  {
		throw new Exception();
		
	}

}
