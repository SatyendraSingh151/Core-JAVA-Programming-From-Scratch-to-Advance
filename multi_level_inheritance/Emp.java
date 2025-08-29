package multi_level_inheritance;
class Person{
	public void food() {
		System.out.println("Yes I eat food.");
	}
	
}

class Student extends Person{
	int rno=151;
	public void school() {
		System.out.println("I have done schooling");
	}
	
}

public class Emp extends Student {
	int id= 124;
	String designation="Developer";

	public static void main(String[] args) {
		// making Emp object
		Emp e =new Emp();
		System.out.println("My id is : "+e.id);
		System.out.println("My roll no was : "+e.rno);
		e.food();
		e.school();

	}

}
