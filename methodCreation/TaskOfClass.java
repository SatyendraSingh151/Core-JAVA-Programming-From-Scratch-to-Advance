package methodCreation;

public class TaskOfClass {
	public static void sum() {
		int a=5,b=10;
		System.out.println("The sum of "+a+" and "+b+" is = "+(a+b));
		
	}
	public static void sub() {
		int a=5,b=10;
		System.out.println("The substraction of "+a+" and "+b+" is = "+(a-b));
		
	}
	public static void mul() {
		int a=5,b=10;
		System.out.println("The multiplication of "+a+" and "+b+" is = "+(a*b));
		
	}
	public static void div() {
		int a=5,b=10;
		System.out.println("The division of "+a+" and "+b+" is = "+(a/b));
		
	}
	public static void mod() {
		int a=5,b=10;
		System.out.println("The modulos of "+a+" and "+b+" is = "+(a%b));
		
	}

	public static void main(String[] args) {
		//calling methods
		sum();
		sub();
		mul();
		div();
		mod();
	}

}
