import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File( "D:\\eclipse-workspace\\HandsOnJAVA\\src\\students.txt"));
		//Scanner scanner = new Scanner(new File( "students.txt"));
		ArrayList<String> a = new ArrayList<String>();
		while(scanner.hasNextLine()) {
			a.add(scanner.nextLine());
		}
		System.out.println(a);
		scanner.close();
		

	}

}
