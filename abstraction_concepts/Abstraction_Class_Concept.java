package abstraction_concepts;

import java.util.Scanner;

// declaring the abstract class along with the abstract methods
abstract class Parent3{
	abstract public int sum(int a,int b);
}
public class Abstraction_Class_Concept extends Parent3 {
	
	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
//		making the object and the reference variable of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program will give you the addition of the value passed to it only of the two digits.");
		
				System.out.print("Give the value of a :");
				int a = sc.nextInt();
				System.out.print("Give the value of a :");
				int b = sc.nextInt();
				
//				making the child object and the reference variable
				Abstraction_Class_Concept c = new Abstraction_Class_Concept();
				
				System.out.println("The sum is =  "+c.sum(7,8));
				
		

	}

}
