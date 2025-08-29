package Exception_Handeling_Concept;

import java.util.Scanner;

public class Exception_By_throws_Keyword {

	public static void main(String[] args) throws Exception{
		
//		making the object of the Scanner class 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the two inputs to perform the division.");
		
		System.out.print("Give the value of a : ");
		int a= sc.nextInt();
		
		System.out.print("Give the value of b : ");
		int b= sc.nextInt();
		
		
		System.out.println("The division is : "+(a/b));

	}

}
