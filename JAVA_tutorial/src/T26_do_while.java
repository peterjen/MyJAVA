import java.util.Scanner;

public class T26_do_while {

	public static void main(String[] args) {
		String password = "letmein";
		Scanner scanner = new Scanner(System.in);
		String guess = "";
		do {
			System.out.println("Guess password:");
			guess = scanner.nextLine();
			
		} while(!password.equals(guess));
		System.out.println("Welcome!");
		scanner.close();
	}
}
