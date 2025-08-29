package methodCreation;

public class Ex5 {
	public static String sample() {
		return "Welcome in function ";
	}
	public static int sum(int a, int b) {
		return (a+b);
	}
	
	public static double sub(double p, double q) {
		return p-q;
	}
	public static int test(char ch) {
		return ch;
	}
	
	

	public static void main(String[] args) {
		
//		it is possible because here widening type casting is done form char to int 
		System.out.println(test('A'));
		
		
		System.out.println("First the main method is executed and then we can call the methods\n");
		// calling the String return type  function
		
		String text= sample();
		System.out.println(text);
		
//		calling the sum function
		int x=45,y=58;
		int s=sum(x,y);
		System.out.println("The sum of "+x+" and "+y+" is = "+s);
		
//		calling double function
		
		double n=9885.365,m=8954.65;
		double substraction=sub(n,m);
		System.out.println("The substraction of "+n+" and "+m+" is = "+substraction);
		

	}

}
