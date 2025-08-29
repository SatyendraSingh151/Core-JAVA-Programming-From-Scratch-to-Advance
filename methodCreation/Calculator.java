package methodCreation;

public class Calculator {
	public static void calc(int a, int b) {
		
		System.out.println("The sum of "+a+" and "+b+" is = "+(a+b));
		System.out.println("The substraction of "+a+" and "+b+" is = "+(a-b));
		System.out.println("The multiplication of "+a+" and "+b+" is = "+(a*b));
		System.out.println("The division of "+a+" and "+b+" is = "+(a/b));
		System.out.println("The modulos of "+a+" and "+b+" is = "+(a%b)+"\n");
		
	}
	
	

	public static void main(String[] args) {
		//calling methods
		System.out.println("Firstly here the program execution starts with the main method and then it will call the method.\n");
		
		int x = 15, y = 6;
		calc(x,y);
		calc(25,65);
	}

}
