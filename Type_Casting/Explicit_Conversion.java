package Type_Casting;

public class Explicit_Conversion {
	static double d =8045647.42478;
	static int a = (int )d;

/*
 * In type conversion when we are going to do it explicitly then we need to type cast
 * 	byte < short < int <long <float <double
 *       <char>
 */
//	explicit
	static float f =1.51f;
	static short s = (short)f;
	
	static float nancy = 10008.00546f;
	static short nan =(short)nancy;
	
	
//	non static variable
	int aa =45;
	double dd =a; // this can also be written as double dd = (double)aa;
	
	
	public static void main(String[] args) {
		
		System.out.println("The converted data is : "+ a);
		System.out.println("The reduced data is : "+s);
		System.out.println("here is the data : "+nan);
		
//		to access the non static variable
		
//		we need to make the object reference
//		here the new keyword creates the new block of memory along with the constructor calling statement and it is assigned to the reference variable for accessing the variable
		


		Explicit_Conversion ref = new Explicit_Conversion();
		System.out.println("The conversion data is : "+ref.dd);
		
	}

}
