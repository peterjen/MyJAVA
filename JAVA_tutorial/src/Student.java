
public class Student extends People implements T95_Talk_Interface{

	public boolean verified = true;
	public String major;


	//@Override
	public void getFullName() {
		System.out.println("Student: " + firstName + " " + lastName);
	}

	public void sayHello() {  // MUST declare sayHello() because it is abstract method from People.
		System.out.println("Abstract from STUDENT Say Hello");
	}

	@Override
	public void sayWelcome() {  // MUST have this method for interface
		System.out.println("Student says WELCOME!");
	}

}
