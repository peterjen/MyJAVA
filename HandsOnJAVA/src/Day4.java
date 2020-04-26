//import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scanner = new Scanner(new File( "D:/eclipse-workspace/HandsOnJAVA/src/students.txt"));
		Scanner scanner = new Scanner(new File( "src/students.txt"));
		ArrayList<String> a = new ArrayList<String>();
		while(scanner.hasNextLine()) {
			a.add(scanner.nextLine());
		}
		System.out.println("print AyyayList directlly:");
		System.out.println(a);
		System.out.println();
		
		System.out.println("print AyyayList from for loop:");
		for (int i=0; i < a.size();i++) {
			System.out.println("name: " + a.get(i));
		}
		System.out.println();
		
		System.out.println("print AyyayList from foreach:");
		for(String s : a) {
			System.out.println(s);
		}
		
		scanner.close();
	}

}
