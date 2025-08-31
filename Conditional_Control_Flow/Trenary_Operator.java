package Conditional_Control_Flow;

public class Trenary_Operator {

	public static void main(String[] args) {
		/* using the ternary operator -> this takes the condition and based on the condition executes the value
		 * this generally used for replacing the multiple lines of code
		 * syntax : (condition ? " true statement " : " false statement ")
		 * 
		 * working  -> if the condition is true then true statement will execute otherwise false statement will execute
		 */
		
		int a= 10;
		int b = 20;
		System.out.println((a>b ? a+" is greater value than "+b:b +" is the greater value than "+a));

	}

}
