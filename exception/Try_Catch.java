package exception;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a ,b;
		
		System.out.print("Give the value of a : ");
		a=sc.nextDouble();
		System.out.print("Give the value of b : ");
		b=sc.nextDouble();
		
		try {
			
			System.out.println("\nDivision is : "+(a/b));
			System.out.println("try block is executed sucessfully.\n");
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Sorry, change your value, you are trying to divide by 0");
			System.out.println("catch block is executed sucessfully.\n");
		}
		
		finally {
			System.out.println("Finally you have done your given task.");
			System.out.println("finally block is executed sucessfully.\n");
		}
		
		System.out.println("Thank you!, hope we meet again.");
		

	}

}
