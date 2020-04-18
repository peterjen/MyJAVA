import java.util.Scanner;

public class MyPasswd {

	public static void main(String[] args) {
		String mypasswd = "letmein";
		Scanner scanner = new Scanner(System.in);
		String guess;
		
		do {
			System.out.println("Guess a Password:");
			guess = scanner.nextLine();
			
		} while(!mypasswd.equals(guess));
			
		System.out.println("Welcome!!!");
/*		
		System.out.println("Please enter Password:");
		Scanner scanner = new Scanner(System.in);
		String myin = scanner.nextLine();
		System.out.println(mypasswd.equals(myin));
*/
		scanner.close();
	}

}
