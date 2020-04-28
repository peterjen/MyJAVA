import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class UserDefinedException_D29 {

	public static void main(String[] args) {
		UserDefinedException_D29 exceptions = new UserDefinedException_D29();
		exceptions.doSomethine();

	}

	private void doSomethine() {
		try {
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.get(5);
			throw new IndexOutOfBoundsException();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("More specific on IndexOutOfBoundsException!");
		} catch (Exception e) {
			System.out.println("Caught Ya!");
			e.printStackTrace();
		} finally {
			// Resource Clean up
		}
		
		try {
			FileInputStream ff = new FileInputStream("src/Mazes.txt");
			throw new IOException();
		} catch (IOException | IndexOutOfBoundsException e) {
			System.out.println("More specific on IOException/ IndexOutOfBoundsException!");
		} catch (Exception e) {
			System.out.println("Caught Ya!");
			e.printStackTrace();
		} finally {
			// Resource Clean up
		}
		
	}

}
