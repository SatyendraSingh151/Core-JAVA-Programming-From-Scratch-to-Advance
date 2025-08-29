package objectCreation3;


public class Stud{
//	declaring the static variables
	static String school="Cambridge";

	

	public static void main(String[] args) {
		//accessing the static variable directly
		System.out.println("Belongs to "+school +" school.");
		
		System.out.println("*******************");
		
//		accessing the static variable by using the class name
		System.out.println("Belongs to "+Stud.school +" school.");
		System.out.println("*******************");
		
//		accessing the static variable by using the object reference
		Stud s1 = new Stud();
		System.out.println("Belongs to "+s1.school +" school.");
		

	}

}
