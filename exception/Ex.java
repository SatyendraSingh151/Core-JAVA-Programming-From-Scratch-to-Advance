package exception;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b;
		System.out.print("Give the value of a :");
		a=sc.nextInt();
		System.out.print("Give the value of b :");
		b=sc.nextInt();
		
		System.out.println("Welcome, sir");
		System.out.println("Congrats, division successfull = "+(a/b));

	}

}
