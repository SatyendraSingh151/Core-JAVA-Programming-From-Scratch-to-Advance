package exception;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b;
		System.out.print("Give the value of a :");
		a=sc.nextInt();
		System.out.print("Give the value of b :");
		b=sc.nextInt();
		
		
		try {
			System.out.println("Welcome, sir");
			System.out.println("Congrats, division successfull = "+(a/b));
			
		}
		catch (ArithmeticException e){
			System.out.println("Sorry, sir");
			System.out.println(e);
			System.out.println("Errors occurs, you are trying to "+e.getMessage());
			
		}

	}

}
