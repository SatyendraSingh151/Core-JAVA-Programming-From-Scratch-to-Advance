package Static_Members;

public class Static_Variable {
/*  the variable name prefixed with the static keyword is the static variable
 * static variable can be directly accessed in the same class 
 * there are 3 ways to access the static variable in the same class
 * 1-> directly by using the variable name
 * 2-> by using the class name as reference
 * 3-> by making the object reference
 * 
 */
	
	static int rno=151;
	static String name="Satya Yadav";
	

	public static void main(String[] args) {
		
//		trying to access the static variable directly by variable name
		System.out.println("The roll no is :"+rno);
		System.out.println("The name of the candidate is :"+name);
		
//		accessing by the help of class name
		System.out.println(Static_Variable.rno);
		System.out.println(Static_Variable.name);
		
//		accessing by the help of object reference
		Static_Variable n = new Static_Variable();
		System.out.println(n.rno);
		System.out.println(n.name);

	}

}
