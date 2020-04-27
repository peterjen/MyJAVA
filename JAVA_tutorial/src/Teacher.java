public class Teacher extends People implements T95_Talk_Interface{

	public Teacher(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	public Teacher() {

	}
	public void sayHello() {
		super.sayHi();   // T92 calling super class method
		System.out.println("Teacher says Hello");
	}
	public void sayWelcome() {  // MUST have this method for interface
		System.out.println("Teacher says WELCOME!");
	}

	// T97 Can not sayHi() here due to final in People
	/*
	public void sayHi() {
		
	}
	*/
}
