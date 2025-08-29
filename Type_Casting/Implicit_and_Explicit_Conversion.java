package Type_Casting;

// type casting is of both the types implicit and the explicit 

public class Implicit_and_Explicit_Conversion {
	static int a=5;
	static float b= 10.5f;
	static float c =a;
	static float sum = a+b;
	
	public static void main(String[] args){
		
		System.out.println("The changed type is : "+c);
		
		System.out.println("The sum is : "+sum);
		
	}

}
