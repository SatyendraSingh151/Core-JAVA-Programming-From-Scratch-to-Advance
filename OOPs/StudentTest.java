package OOPs;
class Student{
	private String name="Satyendra";
//	making getter of name
	public String getName() {
		return name;
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// making the object
		Student s = new Student();
		System.out.println("The private name is :" + s.getName());

	}

}
