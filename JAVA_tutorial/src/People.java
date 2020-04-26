
public abstract class People implements T95_Talk_Interface{    // T85 ABSTRACT CLASS
	

	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public void getFullName() {
		System.out.println(firstName + " " + lastName);
	}
	
	public abstract void sayHello();  // T86 ABSTRACT METHOD MUST BE UNDER ABSTRACT CLASS.  The sub class from People MUST have sayHello()
	//public void sayHello();  // 
	
	public final void sayHi() {   // T96 final NOT ABLE to be inherited !!!
		System.out.println("People level says Hi");
	}
}
