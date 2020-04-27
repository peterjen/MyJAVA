import java.util.Scanner;
/**
 * @author Peter Jen
 *
 */
public class MySweetProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		System.out.println("What is your name!");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("Hello " + name);
		Integer aa = new Integer(3);
		Integer bb = new Integer(3);
		System.out.println(aa == bb);
		int a = 3;
		int b = 3;
		System.out.println(a == b);

/*		
		MySweetProgram x = new MySweetProgram();
		x.tacos();
*/

		scanner.close();
	}

	public void tacos() {
		System.out.println("Tacos");

	}


}