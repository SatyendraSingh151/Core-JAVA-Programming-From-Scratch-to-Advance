package Exception_Handeling_Concept;

/*
 * Exception -> The error which occurs in the program that may be known or unknown
 * Exception is a class which is present in the utility package which is imported as -> import java.util.Throwable
 * 
 * Exception is of two types 
 *1) checked Exception
 *2) unchecked Exception  
 * 
 * hierarchy of Exception is as follows :-
 * 										Throwable
 * 
 * 										Exception
 * 
 * 				RuntimeException   							IOException
 * 
 * 				ArithematicException							FileNotFoundException
 * 				IndexOutOfBoundsException
 * 						ArrayIndexOfOutOfBoundsException
 * 						StringIndexOfOutOfBoundsException
 * 				NullPointerException
 * 				CurrentModificationException
 * 				ClassCastException
 * 
 * 
 * Exception are handled by the help of try - catch block and throws keyword
 * 
 * rule for try catch block
 * 
 *1) try catch block can be executed together
 *2) catch block cannot be executed alone, it needs 
 *3) try block cannot be executed alone it needs catch block or the finally block
 *4) there can be the multiple catch block but catch block must maintain the order of extends class
 *   the child should be in upper side then there should be the parent
 *   
 * 
 */

import java.util.Scanner;

public class Exception_Handeling {

	public static void main(String[] args) {
		
//		making the object of the Scanner class 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the two inputs to perform the division.");
		
		System.out.print("Give the value of a : ");
		int a= sc.nextInt();
		
		System.out.print("Give the value of b : ");
		int b= sc.nextInt();
		
		try {
			double div=(double)a/b;
			System.out.println("The division of a and b is : "+div);
		}
		
		catch(ArithmeticException e) {
			System.out.println("the error is : "+e);
			System.out.println("The Exception is handeled here");
			
		}
		

	}

}
