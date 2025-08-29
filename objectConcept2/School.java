package objectConcept2;
class Students{
	String name;
	int rollno;
}

public class School {

	public static void main(String[] args) {
		//object here
		Students s1 = new Students();
		s1.name="Satya";
		s1.rollno=151;
		System.out.println("Student is "+s1.name +"and roll no is "+s1.rollno);

	}

}
