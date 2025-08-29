package objectConcept2;

public class Student {
//	defining the non static variable
	int rno;
	String name;

	public static void main(String[] args) {
		// making object of the class

		Student s1 = new Student();
		s1.rno=151;
		System.out.println("roll no is "+s1.rno);
		System.out.println("******************************");
		
		Student s2 = new Student();
		s2.rno=152;
		System.out.println("roll no is "+s2.rno);
		System.out.println("******************************");
		
		Student s3 = new Student();
		s3.rno=97;
		System.out.println("roll no is "+s3.rno);
		System.out.println("******************************");
		
		Student s4 = new Student();
		s4.rno=99;
		System.out.println("roll no is "+s4.rno);
		System.out.println("******************************");
				
	}

}
