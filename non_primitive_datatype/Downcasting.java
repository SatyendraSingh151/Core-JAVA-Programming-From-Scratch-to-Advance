package non_primitive_datatype;

class Person{
	public void breathe() {
		System.out.println("Yes all persons breathes oxygen");
	}
	
	String motion = "work";
}


public class Downcasting extends Person{
	public void eats() {
		System.out.println("Yes all persons eat food");
	}
	

	public static void main(String[] args) {

//		Making the object for child class and the reference variable of the parent type
		
//		doing the up casting
		
		Person ref = new Downcasting();
		ref.breathe();
		System.out.println("The nature of the person is : "+ref.motion);

		
        Person p = (Person) new Downcasting();
		
		System.out.println("\nThe nature of the person is : "+p.motion);

		p.breathe();
		
//		p.eats();  CTE
		
//		ref.eats(); CTE
		
		System.out.println("\n***********************\n");
		
//		again doing the down casting
		
		Downcasting ref2 = (Downcasting)ref;
		
		ref2.eats();
		
		
	}

}



	
	