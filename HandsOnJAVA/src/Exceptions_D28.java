//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exceptions_D28 {

	public static void main(String[] args) throws Exception  {
		//int x = Integer.parseInt("pizza");
		//System.out.println(x);
		
		//ArrayList<Integer> a = new ArrayList<Integer>();
		//a.get(5);

		//FileInputStream ff = new FileInputStream("src/Mazes.txt");
		
		doSomething();
		//Exceptions_D28 thisException = new Exceptions_D28();
		//thisException.doSomething();
		
	}

	private static void doSomething() throws Exception    {
		FileInputStream ff = new FileInputStream("src/Mazes.txt");
		System.out.println("My Throwing exception here:");
		throw new Exception();
		
	}

}
