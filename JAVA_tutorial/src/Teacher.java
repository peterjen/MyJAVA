
public class Teacher extends People implements Talk{

	public Teacher(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public void sayHello() {
		super.sayHi();
		System.out.println("Teacher says Hello");
	}
	public void sayWelcome() {
		System.out.println("Teacher says WELCOME!");
	}
}
