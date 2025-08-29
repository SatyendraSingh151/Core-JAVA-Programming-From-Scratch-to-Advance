package nancy;
class Teacher{
	
	Teacher(String college){
		System.out.println("college name  : "+college);
	}
}

public class Student2 extends Teacher{
	
	Student2(String college, int phno){
		super("Kashi Institute Of Technology");
		System.out.println("phone no : "+phno);
	}

	public static void main(String[] args) {
		System.out.println("This is the main method");
		
		Student2 s = new Student2("Kashi Institute Of Technology",84);
		
		

	}

}
