import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> name = new LinkedList<String>();
		Scanner in = new Scanner(new File("src/students.txt"));
		while(in.hasNext()) {
			name.add(in.nextLine());
		}
		
		System.out.println(name.size());
		
		System.out.println(name.pop());
		System.out.println(name);
		name.push("Uno");
		System.out.println(name);
		System.out.println(name.pop());
		System.out.println(name);
		System.out.println(name.pop());
		System.out.println(name);
		System.out.println(name.pop());
		System.out.println(name);
		//System.out.println(name.pop());
		in.close();
	}

}
