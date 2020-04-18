
public class Student extends People{

	public boolean verified = true;
	public String major;
	
	//@Override
	public void getFullName() {
		System.out.println("Student: " + firstName + " " + lastName);
	}
	
	public void sayHello() {  // MUST declare sayHello() because it is abstract method from People.
		System.out.println("Say Hello");
	}

	@Override
	public void sayWelcome() {
		System.out.println("Student says WELCOME!");
		
	}
}
