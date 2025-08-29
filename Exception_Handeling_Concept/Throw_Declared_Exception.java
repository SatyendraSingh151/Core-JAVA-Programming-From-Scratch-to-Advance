package Exception_Handeling_Concept;

import java.util.Scanner;


// to declare our own exception we need to make the class first and establish is-a-relationship to the any of the Throwable family

class AgeException extends Throwable{
	
}

class Parent{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if(age>=18) {
			this.age = age;
			
		}
		else {
			System.out.println("Here you are below 18 years and not eligible to vote.");
//			declaring own exception 
			throw new AgeException();
		}
	}
	
	
}

public class Throw_Declared_Exception {
	
	

	public static void main(String[] args) throws AgeException {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b,div;
		
		System.out.print("Give the value of a : ");
		a=sc.nextDouble();
		System.out.print("Give the value of b : ");
		b=sc.nextDouble();
		
		try {
			
			div=a/b;
			System.out.println("The division performed of the given value of a and b is = "+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Sorry error has occured due to division with "+e);
		}
		
		
		Parent p = new Parent();
		p.setAge(15);
		System.out.println("The age is "+p.getAge());
		
		

	}

}
