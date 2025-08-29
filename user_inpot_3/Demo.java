package user_inpot_3;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		//creating the object of Scanner class
		Scanner sc =  new Scanner(System.in);
		
//		long type data
		System.out.println("You have to enter your phone No. here.");
		long phNo = sc.nextLong();
		System.out.println("phone No. is "+phNo +"\n" );
		
//		float type data
		System.out.println("You have to enter your scored percentage here.");
		float p =sc.nextFloat();
		System.out.println("Scored Percentage is "+p+"%\n");
		
//		short type data
		System.out.println("What is your age ?");
		short age = sc.nextShort();
		System.out.println("Age : "+age+"\n");
		
//		boolean type data
		System.out.println("Tell are you eligible to vote or not ?");
		boolean b = sc.nextBoolean();
		System.out.println("Reply is :" +b+"\n");
		
//		String type data, note there is one problem in using next() and nextLine() together
		System.out.println("Tell yourname first name :");
		String name = sc.next();
		System.out.println("Name is "+name+"\n");
		
		System.out.println("Tell your complete name :");
		String cName = sc.nextLine();
		System.out.println("Complete name is : "+cName+"\n");
		
//		char type input
		System.out.println("Tell your grade : ");
		char grade = sc.next().charAt(0);
		System.out.println("Grade : "+grade);
	}

}
