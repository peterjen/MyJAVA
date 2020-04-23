import java.util.Scanner;

public class T10_Scanner_input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = scanner.nextLine();
		System.out.println(s);
		System.out.println("Enter a int: ");
		int i = scanner.nextInt();
		System.out.println(i);

	}

}
