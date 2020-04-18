import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> name = new LinkedList<String>();

		Scanner in = new Scanner(new File("src\\students.txt"));

		while(in.hasNext()) {
			name.push(in.nextLine());
			
		}
		
		System.out.println("Use Iterator");
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		name.add(2,"UNO");
		System.out.println("Use for loop");
		for(String s : name) {
			System.out.println(s);
		}
		in.close();
	}

}
