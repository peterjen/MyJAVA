
public abstract class People implements Talk{
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public void getFullName() {
		System.out.println(firstName + " " + lastName);
	}
	
	public abstract void sayHello();  // ABSTRACT METHOD MUST BE UNDER ABSTRACT CLASS.  The sub class from People MUST have sayHello()

	public void sayHi() {
		System.out.println("USER level says Hi");
	}
}
