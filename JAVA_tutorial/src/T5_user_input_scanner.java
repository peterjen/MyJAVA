import java.util.Scanner;

public class T5_user_input_scanner {

	public static void main(String[] args) {
		System.out.println("Enter Your Name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
	}

}