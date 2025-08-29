package object_creation1;

public class Student {

	public static void main(String[] args) {
		// object creation
//		here the new keyword is going to create a new block of memory every time
		System.out.println("Here the address is stored in the referance variable \nand new keyword will create a block of image every time.\n");;
		Student s1= new Student();
		System.out.println(s1);
		Student s2= new Student();
		System.out.println(s2);
		Student s3= new Student();
		System.out.println(s3);

	}

}
