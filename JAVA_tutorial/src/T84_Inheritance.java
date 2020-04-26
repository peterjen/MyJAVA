import java.util.ArrayList;
import java.util.List;

public class T84_Inheritance {

	public static void main(String[] args) {
		System.out.println("######## T84 ");
		Student s = new Student();
		s.firstName = "JJ";
		s.lastName = "Jen";
		s.major = "Math";
		
		
		System.out.println(s.verified);
		System.out.println(s.major);
		s.getFullName();
		s.sayHello();
		//System.exit(0);
		//  T85 - abstract Class  (People is not exist if People is defined ABSTRACT
		/*
		People ple = new People();
		ple.firstName="GG";
		ple.lastName="ZZ";
		ple.getFullName();
		*/
		
		
		System.out.println("####### T88 Polymorphism ");
		Student me = new Student();                         // Student Class has no Constructor
		Teacher you = new Teacher("June","Chen");			// Teacher Class Constructor
		me.firstName = "Peter";
		me.lastName = "Jen";
		//you.firstName = "June";
		//you.lastName = "Chen";
		
		List<People> ulist = new ArrayList<People>();	// People <LIST>  Class
		ulist.add(me);						// Add student/ teacher Class to People class List
		ulist.add(you);
		for (People p : ulist) {
			p.sayHello();			// Ploymorphism : call their own sayHello()
		}
		// System.exit(0);
		
		System.out.println("####### T91 Constructer ");
		Teacher t = new Teacher("Teach","Er");     // teacher use user defined constructor
		t.getFullName();
		t.sayHello();
		
		System.out.println("####### T92 Call Parent level method using SUPER ");
		Teacher t2 = new Teacher();					// teacher use default constructor T89
		t2.firstName = "Teacher2";
		t2.lastName = "teacher2";
		t2.getFullName();
		t2.sayHello();
		t2.sayHi();		// Calling People's sayHi()
		
		System.out.println("####### T95 Call interface from Talk ");
		Teacher t3 = new Teacher("Teacher3", "teacher3");
		t3.getFullName();
		t3.sayWelcome();
		s.sayWelcome();
		
		List<T95_Talk_Interface> whoCanTalk = new ArrayList<T95_Talk_Interface>();
		whoCanTalk.add(t3);
		whoCanTalk.add(s);
		
		
		System.out.println("###  T98 enum USAGE");
		Jen_enum jen = new Jen_enum();
		jen.tsize = jen.tsize.xl;
		System.out.println(jen.tsize);
		
		
		
	}

}