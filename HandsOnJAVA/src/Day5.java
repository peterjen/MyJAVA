import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> name = new LinkedList<String>();
		Scanner in = new Scanner(new File("src/students.txt"));
		while(in.hasNext()) {
			//name.add(in.nextLine());  // ADD to the end => QUEUE  first in first out
			name.push(in.nextLine());  // PUSH to the front => STACK first in last out

		}
		System.out.println(name);
		System.out.println(name.size());
		
		System.out.println(name.pop());			// remove first element 
		//System.out.println(name.remove());   // remove first element same as pop by default.  remove(2) will remove the 2nd element.  remove("Peter") will remove "Peter"
		//System.out.println(name.removeFirst());  // remove first element  same as pop
		System.out.println(name);
		System.exit(0);
		name.push("Uno");
		//System.out.println(name);
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
