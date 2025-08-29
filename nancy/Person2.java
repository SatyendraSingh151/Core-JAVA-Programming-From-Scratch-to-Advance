package nancy;

class Student{
	static String clg="Kashi Institute of Technology";
}

public class Person2 {

	public static void main(String[] args) {
		
//		System.out.println(" +student.clg :"+clg);
		
//		1st  => we can use it by className.staticVariableName because it is in the different class
		System.out.println("This student belongs to "+Student.clg);
		System.out.println("**********************");
		
		
//		2nd => we can make the object of the Student class to use
		
		Student s1 = new Student();
		System.out.println("This student belongs to "+s1.clg);
		
		

	}

}
